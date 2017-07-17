package org.fxgsc.shopweb.controller;


import java.util.List;
import javax.servlet.http.HttpSession;
import org.fxgsc.shopweb.domain.Good;
import org.fxgsc.shopweb.domain.Save;
import org.fxgsc.shopweb.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GoodController {
	@Autowired
	@Qualifier("shopService")
	private ShopService shopService;
	
	/*
	 * 首页商品
	 */
	
	@RequestMapping(value="/main")
	 public ModelAndView goodfindAll(ModelAndView mv){
		
			List<Good> goods =shopService.goodfindAll();
			mv.addObject("goods", goods);
			// 设置客户端跳转到查询请求
			mv.setViewName("main");
	
		// 返回
		return mv;
	}
	
	/*
	 * 女装页面
	 */
	
	@RequestMapping(value="/nv")
	 public ModelAndView goodfindnv(ModelAndView mv){
		
			List<Good> goods =shopService.goodfindnv();
			mv.addObject("goods", goods);
			// 设置客户端跳转到查询请求
			mv.setViewName("nvForm");
	
		// 返回
		return mv;
	}
	
	/*
	 * 手表商品
	 */
	
	@RequestMapping(value="/watch")
	 public ModelAndView goodfindwatch (ModelAndView mv){
		
			List<Good> goods =shopService.goodfindwatch();
			mv.addObject("goods", goods);
			// 设置客户端跳转到查询请求
			mv.setViewName("watchForm");
	
		// 返回
		return mv;
	}
	
	/*
	 * 3C商品
	 */
	
	@RequestMapping(value="/3C")
	 public ModelAndView goodFind3C(ModelAndView mv){
		
			List<Good> goods =shopService.goodfind3C();
			mv.addObject("goods", goods);
			// 设置客户端跳转到查询请求
			mv.setViewName("3CForm");
	
		// 返回
		return mv;
	}
	
	/*
	 * 添加商品
	 *
	 */
	@RequestMapping(value="/addGood")
	 public ModelAndView insertGood(Integer goodid, String goodname, Integer goodprice, String goodpicture, String goodpicture1,
				String goodpicture2, String goodcategory, String gooddescription, Integer goodsavenum,ModelAndView mv){
		
			shopService.insertGood(goodid, goodname, goodprice, goodpicture, goodpicture1, goodpicture2, goodcategory, gooddescription, goodsavenum);
			
			// 设置客户端跳转到查询请求
			mv.setViewName("main");
	
		// 返回
		return mv;
	}
	
	
	
	
	
	
	
	/*
	 * 商品详情
	 */
	@RequestMapping(value="/goodDetail")
	 public ModelAndView goodfindone(String goodname,ModelAndView mv){
		
			List<Good> goods =shopService.goodfindone(goodname);
			mv.addObject("goods", goods);
			// 设置客户端跳转到查询请求
			mv.setViewName("gooddetailForm");
	
		// 返回
		return mv;
	}
	/*
	 * 收藏部分
	 */
	@RequestMapping(value="/mySave")
	public ModelAndView mysavefindAll(ModelAndView mv, String username){
		List<Save> mysaves=shopService.mysaveFindAll(username);
		mv.addObject("mysaves", mysaves);
		// 设置客户端跳转到查询请求
		mv.setViewName("saveForm");
		
	// 返回
	return mv;	
	}
	
	@RequestMapping(value="/addSave")
	public ModelAndView addsave(ModelAndView mv,@RequestParam("username") String username,@RequestParam("goodname") String goodname,@RequestParam("goodpicture") String goodpicture){
		shopService.mysaveAdd(username, goodname, goodpicture);
		
		// 设置客户端跳转到查询请求
		mv.setViewName("main");
	// 返回
	return mv;	
	}
	
	@RequestMapping(value="/deleteSave")
	public ModelAndView mysaveDelete(String goodname,ModelAndView mv,HttpSession session){
		shopService.mysaveDelete(goodname);
		// 设置客户端跳转到查询请求
		mv.setViewName("saveForm");
	// 返回
	return mv;	
	}
}
