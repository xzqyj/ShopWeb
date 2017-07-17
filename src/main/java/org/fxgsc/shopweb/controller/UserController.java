package org.fxgsc.shopweb.controller;



import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.fxgsc.shopweb.domain.User;
import org.fxgsc.shopweb.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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
	
	@RequestMapping(value="/register")
	 public ModelAndView register(@RequestParam("username") String username,@RequestParam("password") String password,
			 @RequestParam("phone") String phone,@RequestParam("address") String address,ModelAndView mv){
			shopService.insertUser(username,password,phone,address);
			mv.setViewName("main");
		// 返回
		return mv;
	}
	
	@RequestMapping(value="/updatepassword")
	 public ModelAndView update(@RequestParam("username") String username,@RequestParam("password") String password,ModelAndView mv){
			shopService.updatePassword(username, password);;
			// 设置客户端跳转到查询请求
			
			
			mv.setViewName("main");
		// 返回
		return mv;
	}
	
	@RequestMapping(value="/findPassword")
	 public ModelAndView findPassword(@RequestParam("username") String username,ModelAndView mv){
			shopService.findPassword(username);
			User users=shopService.findPassword(username);
			mv.addObject("users", users);
			
			mv.setViewName("updatepasswordForm");
		// 返回
		return mv;
	}
}
