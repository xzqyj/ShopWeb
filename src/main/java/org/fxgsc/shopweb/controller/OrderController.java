package org.fxgsc.shopweb.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.fxgsc.shopweb.domain.UserOrder;
import org.fxgsc.shopweb.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class OrderController {
	@Autowired
	@Qualifier("shopService")
	private ShopService shopService;

	/*
	 * 提交订单
	 */
	@RequestMapping(value="/addOrder")
	public String order(Model model,HttpServletRequest request, String goodname, String username, Integer goodid, String goodpicture, Integer goodprice, Integer goodnum, Integer orderprice, String useraddress, String orderstatus){
		String useraddress1=request.getParameter(useraddress);
		String orderstatus1="已付款";
		Integer  orderprice1=12;
		shopService.insertUserOrder(username, goodid, goodname, goodpicture, goodprice, goodnum, orderprice1, useraddress1, orderstatus1);
		// 设置客户端跳转到查询请求
		return "main";
	// 返回
	
	}
//	public ModelAndView insertUserOrder(String username,Integer goodid,String goodname,  String goodpicture, Integer goodprice,
//			Integer goodnum,Integer orderprice, String useraddress, String orderstatus,ModelAndView mv,HttpSession session
//			,HttpServletRequest request){
//		
//		String useraddress1="hahahah";
//		String orderstatus1="已付款";
//		Integer  orderprice1=12;
//		shopService.insertUserOrder(username, goodid, goodname, goodpicture, goodprice, goodnum, orderprice1, useraddress1, orderstatus1);
//		// 设置客户端跳转到查询请求
//		mv.setViewName("main");
//	// 返回
//	return mv;	
//	}
	@RequestMapping(value="/myOrder")
	public ModelAndView orderFind(ModelAndView mv, String username){
		List<UserOrder>  orders=shopService.orderFindAll(username);
		mv.addObject("orders", orders);
		// 设置客户端跳转到查询请求
		mv.setViewName("orderdetailForm");

	// 返回
	return mv;	
	}
	
	@RequestMapping(value="/evaluation")
	public ModelAndView evaluation(ModelAndView mv, Integer id){
		List<UserOrder>  orders=shopService.orderFindId(id);
		mv.addObject("orders", orders);
		// 设置客户端跳转到查询请求
		mv.setViewName("evaluationForm");

	// 返回
	return mv;	
	}
	
	@RequestMapping(value="/addRemark")
	public String remark(Model model,HttpServletRequest request, String goodremark,Integer id){
		
		shopService.insertGoodRemark(goodremark,id);
		// 设置客户端跳转到查询请求
		return "main";
	// 返回
	
	}
}
