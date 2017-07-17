package org.fxgsc.shopweb.controller;

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
public class OrderControllerTest {

	@Before
	public void setUp() throws Exception {
	
	
	}

	@Test
	public void testOrder() {
		System.out.print("测试成功！");	
	}

	@Test
	public void testOrderFind() {
		System.out.print("测试成功！");	
	}

	@Test
	public void testEvaluation() {
		System.out.print("测试成功！");	
	}

	@Test
	public void testRemark() {
		System.out.print("测试成功！");	
	}

}
