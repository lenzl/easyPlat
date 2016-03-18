package com.easyplat.module.test.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.easyplat.module.test.service.TestService;

@Controller
public class TestController {
	
	@Autowired
	private TestService testService;
	
	@RequestMapping(value="/simple")
	public @ResponseBody String simple() {
		
		testService.print();
		
		return "Hello world!";
	}
	
}
