package com.lz.test.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
@RequestMapping(value = "/hi")
public class UserController {

	@RequestMapping(value = "/index") 
	public String test() {
		return "index2";        
	}   
}    
    