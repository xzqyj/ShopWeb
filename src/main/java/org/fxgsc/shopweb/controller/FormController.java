package org.fxgsc.shopweb.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 动态页面跳转控制器
 * */
@Controller
public class FormController{

	@RequestMapping(value="/{formName}")
	 public String loginForm(@PathVariable String formName){
		// 动态跳转页面

		return formName;
	}
	
	@RequestMapping(value="/loginForm")
	public String login(HttpServletRequest request,Model model){
		Cookie[] cookies=null;
		cookies= request.getCookies();
		String[] s = null;
		for(Cookie c:cookies){
			if(c.getName().equals("user")){
				s=c.getValue().split(" ");
			}
		}
		System.out.println(s);
		model.addAttribute("username",s[0]);
		model.addAttribute("pass",s[1]);
		return "loginForm";
	}
}

