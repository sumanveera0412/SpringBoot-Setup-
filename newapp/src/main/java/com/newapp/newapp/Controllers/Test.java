package com.newapp.newapp.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class Test {
	
	@GetMapping("/append")
	public String name() {
		
		String a="6";
		String b="8";
		String c="0";
	
		c = a+b;
		
		
		return c;
	}

}
