package org.fxgsc.shopweb.service.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.fxgsc.shopweb.domain.Good;
import org.fxgsc.shopweb.domain.Save;
import org.fxgsc.shopweb.domain.User;
import org.fxgsc.shopweb.domain.UserOrder;
import org.fxgsc.shopweb.mapper.GoodMapper;
import org.fxgsc.shopweb.mapper.OrderMapper;
import org.fxgsc.shopweb.mapper.ShopcartMapper;
import org.fxgsc.shopweb.mapper.UserMapper;
import org.fxgsc.shopweb.service.ShopService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)   
@ContextConfiguration(locations={"classpath*:/WEB-INF/applicationContext.xml","classpath*:/WEB-INF/springmvc-config.xml"})

public class ShopServiceImplTest {
	@Qualifier("shopService")
	private ShopService shopService;
	
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
    private GoodMapper goodMapper;
	
	@Autowired
    private ShopcartMapper shopcartMapper;
	
	@Autowired
    private OrderMapper orderMapper;
	
	@Before
	public void setUp() throws Exception {
	}

	
	/*
	 * 测试登录是否成功
	 */
	@Test
	public void testLogin() {
		User user=userMapper.login("zzz", "123456");
		if(user!=null){
			System.out.print("登录成功！");
		}else{
			System.out.print("登录名或密码错误！请重新输入");
		}
	}
//
	/*
	 * 测试插入用户
	 */
	@Test
	public void testInsertUser() {
		 userMapper.insertUser("test", "test", "123456789", "大学路1号");
		 System.out.print("插入成功！");
	}
//
//	@Test
//	public void testUpdatePassword() {
//		System.out.print("测试成功！");
//	}
//
	
	/*
	 * 测试找回密码
	 */
	@Test
	public void testFindPassword() {
		User  password=userMapper.findPassword("zzz");
		System.out.print(password);
	}
//
//	@Test
//	public void testGoodfindAll() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testInsertGood() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testGoodfindnv() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testGoodfindwatch() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testGoodfind3C() {
//		fail("Not yet implemented");
//	}
//
	/*
	 * 查找某个商品
	 */
	@Test
	public void testGoodfindone() {
		List<Good> goods=goodMapper.goodfindone("手表");
		for(Good good:goods){
			System.out.println(good.getId()+good.getGoodCategory()+good.getGoodDescription());
		};
	}
//
//	@Test
//	public void testShopcartfindAll() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testInsertShopCart() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testDeleteShopCart() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testMysaveAdd() {
//		fail("Not yet implemented");
//	}

	/*
	 * 根据用户名查找收藏夹
	 */
	@Test
	public void testMysaveFindAll() {
		List<Save> saves= goodMapper.mysaveFindAll("wqwqw");
		
//		
		for(Save save:saves){
//			good=goods.get(i);
			System.out.println(save.getGoodName()+save.getUserName());
		}
	}

//	@Test
//	public void testMysaveDelete() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testInsertUserOrder() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testOrderFindAll() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testInsertGoodRemark() {
//		fail("Not yet implemented");
//	}

	/*
	 * 测试查找用户订单 根据订单id
	 */
	@Test
	public void testOrderFindId() {
		System.out.print("测试查找某个订单!");
		
		List<UserOrder> orders= orderMapper.orderFindId(1);
		
		for(UserOrder order:orders){
			
			System.out.println(order.getGoodName()+order.getGoodNum()+order.getGoodPrice()) ;
		}
	}
}
