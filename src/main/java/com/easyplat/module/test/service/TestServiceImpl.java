package com.easyplat.module.test.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService{

	private static Logger logger =LoggerFactory.getLogger(TestServiceImpl.class);
	
	public void print() {
		
		logger.info("============>service is execute");
		
	}
	
}
