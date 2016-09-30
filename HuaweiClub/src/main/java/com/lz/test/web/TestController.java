package com.lz.test.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "") 
public class TestController {

	@RequestMapping(value = "home.do") 
	public String test() {
		return "index";         
	} 
}  
