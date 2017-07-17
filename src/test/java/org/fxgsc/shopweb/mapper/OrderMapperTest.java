package org.fxgsc.shopweb.mapper;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)   
@ContextConfiguration(locations={"classpath*:/WEB-INF/applicationContext.xml","classpath*:/WEB-INF/springmvc-config.xml"})
public class OrderMapperTest {

	@Before
	public void setUp() throws Exception {
	}

	/*
	 * 测试插入用户订单
	 */
	@Test
	public void testInsertUserOrder() {
		
	}

	@Test
	public void testOrderFindAll() {
		System.out.print("测试成功！");	
	}

	@Test
	public void testOrderFindId() {
		System.out.print("测试成功！");	
	}

	@Test
	public void testInsertGoodRemark() {
		System.out.print("测试成功！");	
	}

}
