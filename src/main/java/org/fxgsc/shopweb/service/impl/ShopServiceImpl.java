 package org.fxgsc.shopweb.service.impl;



import org.fxgsc.shopweb.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import org.fxgsc.shopweb.domain.*;
import org.fxgsc.shopweb.mapper.*;




@Service("shopService")
public class ShopServiceImpl implements ShopService{


	@Autowired
	private UserMapper userMapper;
	
	@Autowired
    private GoodMapper goodMapper;
	
	@Autowired
    private ShopcartMapper shopcartMapper;
	
	@Autowired
    private OrderMapper orderMapper;
	
	/*
	 * 用户部分(non-Javadoc)
	 * @see org.fxgsc.shopweb.service.ShopService#login(java.lang.String, java.lang.String)
	 */
	@Override
	public User login(String username, String password) {
		return userMapper.login(username, password);
	}

	@Override
	public void insertUser(String username,String password,String phone,String address) {
		userMapper.insertUser(username, password, phone, address);
		
	}

	@Override
	public void updatePassword(String username, String password) {
		userMapper.updatePassword(username, password);
		
	}
	
	@Override
	public User findPassword(String username) {
		// TODO Auto-generated method stub
		return userMapper.findPassword(username);
	}

/*
 * 查找全部商品(non-Javadoc)
 * @see org.fxgsc.shopweb.service.ShopService#goodfindAll()
 */

	@Override
	public List<Good> goodfindAll() {
		// TODO Auto-generated method stub
		return goodMapper.goodfindfAll();
	}
	/*
	 * 添加商品
	 */

	@Override
	public void insertGood(Integer goodid, String goodname, Integer goodprice, String goodpicture, String goodpicture1,
			String goodpicture2, String goodcategory, String gooddescription, Integer goodsavenum) {
		goodMapper.insertGood(goodid, goodname, goodprice, goodpicture, goodpicture1, goodpicture2, goodcategory, gooddescription, goodsavenum);
		
	}
/*
 * 查找女装
 */
	@Override
	public List<Good> goodfindnv() {
		// TODO Auto-generated method stub
		return goodMapper.goodfindnv();
	}
	/*
	 * 查找手表
	 */	
	@Override
	public List<Good> goodfindwatch() {
		// TODO Auto-generated method stub
		return goodMapper.goodfindwatch();
	}
	/*
	 * 查找3C
	 */
	@Override
	public List<Good> goodfind3C() {
		// TODO Auto-generated method stub
		return goodMapper.goodfind3C();
	}
	
	@Override
	public List<Good> goodfindone(String goodname) {
		// TODO Auto-generated method stub
		return goodMapper.goodfindone(goodname);
	}

	/*
	 * 购物车部分(non-Javadoc)
	 * @see org.fxgsc.shopweb.service.ShopService#deleteShopCart(java.lang.String)
	 */
	
	@Override
	public List<ShopCart> shopcartfindAll(String username) {
		// TODO Auto-generated method stub
		return shopcartMapper.shopcartfindAll(username);
	}


	@Override
	public void insertShopCart(String username, String goodname, Integer goodid, String goodpicture,
			Integer goodprice,Integer goodnum) {
		shopcartMapper.insertShopCart(username, goodname, goodid, goodpicture, goodprice,goodnum);
		
	}

	@Override
	public void deleteShopCart(String goodname) {
		shopcartMapper.deleteShopCart(goodname);
		
	}
	
	/*
	 * 收藏部分(non-Javadoc)
	 * @see org.fxgsc.shopweb.service.ShopService#mysaveAdd(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public void mysaveAdd(String username, String goodname, String goodpicture) {
		goodMapper.mysaveAdd(username, goodname, goodpicture);
		
	}

	@Override
	public List<Save> mysaveFindAll(String username) {
		// TODO Auto-generated method stub
		return goodMapper.mysaveFindAll(username);
	}

	@Override
	public void mysaveDelete(String goodname) {
		goodMapper.mysaveDelete(goodname);
		
	}


	/*
	 * 订单部分(non-Javadoc)
	 * @see org.fxgsc.shopweb.service.ShopService#insertUserOrder(java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String)
	 */
	
	@Override
	public void insertUserOrder(String username, Integer goodid, String goodname, String goodpicture, Integer goodprice,
			Integer goodnum, Integer orderprice, String useraddress, String orderstatus) {
		// TODO Auto-generated method stub
		orderMapper.insertUserOrder(username, goodid, goodname, goodpicture, goodprice, goodnum, orderprice, useraddress, orderstatus);
	}

	@Override
	public List<UserOrder> orderFindAll(String username) {
		// TODO Auto-generated method stub
		return orderMapper.orderFindAll(username);
	}

	@Override
	public void insertGoodRemark(String goodremark,Integer id) {
		orderMapper.insertGoodRemark(goodremark,id);
		
	}

	@Override
	public List<UserOrder> orderFindId(Integer id) {
		// TODO Auto-generated method stub
		return orderMapper.orderFindId(id);
	}


	
	

	

	


	
}
