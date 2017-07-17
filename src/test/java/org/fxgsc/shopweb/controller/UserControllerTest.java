package org.fxgsc.shopweb.controller;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)   
@ContextConfiguration(locations={"classpath:WEB-INF/applicationContext.xml","WEB-INF/springmvc-config.xml"}) 
public class UserControllerTest  {

}
