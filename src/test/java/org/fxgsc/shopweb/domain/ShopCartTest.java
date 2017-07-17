package org.fxgsc.shopweb.domain;

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
public class ShopCartTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetId() {
		System.out.print("测试成功！");
	}

	@Test
	public void testSetId() {
		System.out.print("测试成功！");
	}

	@Test
	public void testGetUserName() {
		System.out.print("测试成功！");
	}

	@Test
	public void testSetUserName() {
		System.out.print("测试成功！");
	}

	@Test
	public void testGetGoodName() {
		System.out.print("测试成功！");
	}

	@Test
	public void testSetGoodName() {
		System.out.print("测试成功！");
	}

	@Test
	public void testGetGoodPrice() {
		System.out.print("测试成功！");
	}

	@Test
	public void testSetGoodPrice() {
		System.out.print("测试成功！");
	}

	@Test
	public void testGetGoodId() {
		System.out.print("测试成功！");
	}

	@Test
	public void testSetGoodId() {
		System.out.print("测试成功！");
	}

	@Test
	public void testGetGoodPicture() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetGoodPicture() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetGoodNum() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetGoodNum() {
		fail("Not yet implemented");
	}

}
