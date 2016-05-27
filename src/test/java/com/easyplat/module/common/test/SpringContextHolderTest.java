package com.easyplat.module.common.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.easyplat.module.common.utils.SpringContextHolder;
import com.easyplat.module.test.service.TestServiceImpl;

@ContextConfiguration(locations={"/applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class SpringContextHolderTest {
	
	@Test
	public void testGetBean() {
		
		TestServiceImpl testServiceImpl = SpringContextHolder.getBean("testServiceImpl");
		
		assertEquals(TestServiceImpl.class,testServiceImpl.getClass());
	}
}
