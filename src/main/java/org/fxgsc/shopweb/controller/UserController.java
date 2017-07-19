package org.fxgsc.shopweb.controller;



import java.io.IOException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.fxgsc.shopweb.domain.User;
import org.fxgsc.shopweb.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * 处理用户请求控制器
 * */
@Controller
public class UserController {
	
	/**
	 * 自动注入UserService
	 * */
	@Autowired
	@Qualifier("shopService")
	private ShopService shopService;
	
	
	/*
	 * 登录并创建cookie
	 */
	@RequestMapping(value="/login")
	public ModelAndView login(String loginname,String password,ModelAndView mv,HttpSession session,
			HttpServletResponse response){
		Cookie c = new Cookie("user",loginname+" "+password);
		c.setMaxAge(24*3600);
		response.addCookie(c);
		User user=shopService.login(loginname, password);
		if(user!=null){
			
			session.setAttribute("user", user);
			mv.setViewName("main");
		
		}else{
			mv.addObject("message", "登录名或密码错误！请重新输入");
			mv.setViewName("loginForm");
		}
		return mv;
	}
	
	/*
	 * 注册
	 */
	@RequestMapping(value="/register")
	 public ModelAndView register(@RequestParam("username") String username,@RequestParam("password") String password,
			 @RequestParam("phone") String phone,@RequestParam("email") String email,@RequestParam("address") String address,ModelAndView mv){
			shopService.insertUser(username,password,phone,email,address);
			mv.setViewName("main");
		// 返回
		return mv;
	}
	
	/*
	 * 修改密码
	 */
	@RequestMapping(value="/updatepassword")
	 public ModelAndView update(@RequestParam("username") String username,@RequestParam("password") String password,ModelAndView mv){
			shopService.updatePassword(username, password);;
			// 设置客户端跳转到更新请求			
			mv.setViewName("loginForm");
		// 返回
		return mv;
	}
	
	/*
	 * 通过用户名查找密码
	 */
	@RequestMapping(value="/findPassword")
	 public ModelAndView findPassword(@RequestParam("username") String username,ModelAndView mv){
			shopService.findPassword(username);
			User users=shopService.findPassword(username);
			mv.addObject("users", users);
			
			mv.setViewName("updatepasswordForm");
		// 返回
		return mv;
	}
	/*
	 * 通过邮件发送找回密码
	 */
	@RequestMapping(value="/find")
	 public ModelAndView find(String username,String useremail,ModelAndView mv,HttpSession session,HttpServletResponse response) throws Exception{		
		User user=shopService.findPasswordEmail(username, useremail);
		//System.out.println("读取密码"+user.getUserPassword());检验是否读取出来	
	if(user!=null){
			StringBuffer url=new StringBuffer();
			StringBuilder builder=new StringBuilder();
			//邮件的正文
			builder.append("");
			url.append("您的密码是："+user.getUserPassword()+"");
			builder.append("");
			builder.append(""+url+"");
			builder.append("");
			SimpleEmail sendemail=new SimpleEmail();
			sendemail.setHostName("smtp.163.com");
			sendemail.setAuthentication("jsxzqyj@163.com","951208qyj");
			sendemail.setCharset("UTF-8");
			//System.out.println("测试builder"+builder.toString());
			try{
				sendemail.setCharset("UTF-8");
				sendemail.addTo(useremail);
				sendemail.setFrom("jsxzqyj@163.com");
				sendemail.setSubject("欢乐购商城--找回密码");
				sendemail.setMsg(builder.toString());
				sendemail.send();
				//System.out.println(builder.toString());
			}catch(EmailException e){
				e.printStackTrace();
				System.out.println("测试e");
			}
			
			mv.setViewName("loginForm");
		}else{		
			
			response.getWriter().println("密码获取失败！");
		}
		return mv;	
		
	}
}
