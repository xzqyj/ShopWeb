package org.fxgsc.shopweb.mapper;



import java.util.List;
import org.apache.ibatis.annotations.Select;
import org.fxgsc.shopweb.domain.Good;
import org.fxgsc.shopweb.domain.UserOrder;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)   
@ContextConfiguration(locations={"classpath*:/WEB-INF/applicationContext.xml","classpath*:/WEB-INF/springmvc-config.xml"}) 
public class GoodMapperTest {
	@Autowired
    private GoodMapper goodMapper;
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGoodfindfAll() {
		
		List<Good> goods= goodMapper.goodfindfAll();
		
//		Good good=null;
		for(Good good:goods){
//			good=goods.get(i);
			System.out.println(good.getId()+good.getGoodName()+good.getGoodCategory());
		}
	}
}
