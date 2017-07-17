package org.fxgsc.shopweb.service;

import java.util.List;
import org.fxgsc.shopweb.domain.Good;
import org.fxgsc.shopweb.domain.Save;
import org.fxgsc.shopweb.domain.ShopCart;
import org.fxgsc.shopweb.domain.User;
import org.fxgsc.shopweb.domain.UserOrder;

public interface ShopService {
	/**
	 * 用户登录
	 * @param  loginname
	 * @param  password
	 * @return User对象
	 * */
	User login(String loginname,String password);
	
	void insertUser(String username,String password,String phone,String address);
	
	void updatePassword(String username,String password);
	
	User findPassword(String username);
	/**
	 *获取商品
	 */
	List<Good> goodfindAll();
	
	/*
	 * nv
	 */
	List<Good> goodfindnv();
	List<Good> goodfindwatch();
	List<Good> goodfind3C();
	List<Good> goodfindone(String goodname);
	
	void insertGood(Integer goodid,String goodname,Integer goodprice,String goodpicture,String goodpicture1,String goodpicture2,
			 String goodcategory,String gooddescription,Integer goodsavenum);
	/*
	 * 购物车部分
	 */
	void insertShopCart(String username,String goodname, Integer goodid, String goodpicture,Integer goodprice,Integer goodnum);
	
	List<ShopCart> shopcartfindAll(String username);
	
	void deleteShopCart(String goodname);
	
	/*
	 * 收藏部分  
	 */
	
	List<Save> mysaveFindAll(String username);
	
	void mysaveAdd(String username,String goodname, String goodpicture);
	
	void mysaveDelete(String goodname);
	
	/*
	 * 订单部分
	 */
	void insertUserOrder(String username,Integer goodid,String goodname,String goodpicture,Integer goodprice,Integer goodnum,Integer orderprice, String useraddress, String orderstatus);
	
	List<UserOrder> orderFindAll(String username);
	
	void insertGoodRemark( String goodremark,Integer id);
	
	
	List<UserOrder> orderFindId(Integer id);
	
}
