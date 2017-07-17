package org.fxgsc.shopweb.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.fxgsc.shopweb.domain.ShopCart;
import org.fxgsc.shopweb.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ShopcartController {

	
	@Autowired
	@Qualifier("shopService")
	private ShopService shopService;
	
	@RequestMapping(value="/myShopcart")
	public ModelAndView shopcartfindAll(ModelAndView mv, String username){
		List<ShopCart>  shopcarts=shopService.shopcartfindAll(username);
		mv.addObject("shopcarts", shopcarts);
		// 设置客户端跳转到查询请求
		mv.setViewName("shopcartForm");

	// 返回
	return mv;	
	}
	
	@RequestMapping(value="/addShopcart")
	public ModelAndView insertShopCart(String username,String goodname, Integer goodid, String goodpicture,
			Integer goodprice,Integer goodnum,ModelAndView mv,HttpSession session){
		Integer goodnum1=1;
		shopService.insertShopCart(username, goodname, goodid, goodpicture, goodprice,goodnum1);
		// 设置客户端跳转到查询请求
		mv.setViewName("main");
	// 返回
	return mv;	
	}
	
	@RequestMapping(value="/addShopcart1")
	public ModelAndView insertShopCart1(String username,String goodname, Integer goodid, String goodpicture,
			Integer goodprice,Integer goodnum,ModelAndView mv,HttpServletRequest request ){	
		Integer goodnum1= Integer.parseInt(request.getParameter("goodnum"));
		shopService.insertShopCart(username, goodname, goodid, goodpicture, goodprice,goodnum1);
		// 设置客户端跳转到查询请求
		mv.setViewName("main");
	// 返回
	return mv;	
	}
	
	@RequestMapping(value="/deleteShopcart")
	public ModelAndView deleteShopCart(String goodname,ModelAndView mv,HttpSession session){
		shopService.deleteShopCart(goodname);
		// 设置客户端跳转到查询请求
		mv.setViewName("shopcartForm");
	// 返回
	return mv;	
	}
}

