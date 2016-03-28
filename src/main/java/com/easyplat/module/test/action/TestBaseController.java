package com.easyplat.module.test.action;

import java.beans.PropertyEditorSupport;
import java.util.Date;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import com.easyplat.module.common.utils.DateUtils;

public class TestBaseController {
	
	@InitBinder
    public void initBinder(WebDataBinder binder) {
		
		binder.registerCustomEditor(String.class, new PropertyEditorSupport() {
			
			@Override
			public void setAsText(String text) throws IllegalArgumentException {
				System.out.println("-----String setAsText ------"+text);
				setValue(text);
			}

			@Override
			public String getAsText() {
				System.out.println("-----String getAsText ------"+super.getAsText());
				Object value = getValue();
				return value != null ? value.toString() : "";
			}
		
		});
		
		binder.registerCustomEditor(Date.class, new PropertyEditorSupport() {
			
			@Override
			public void setAsText(String text) throws IllegalArgumentException {
				System.out.println("-----Date setAsText ------"+text);
				setValue(DateUtils.parseDate(text));
			}
		
		});
		
	}

}
