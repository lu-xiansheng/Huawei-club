package com.lz.test.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping( "/test")
public class UserController {

	@RequestMapping("/hi")
	public String test() {
		return "index";
	}      
}    
