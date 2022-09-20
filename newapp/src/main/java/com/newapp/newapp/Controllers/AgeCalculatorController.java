package com.newapp.newapp.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ageCalculator")
public class AgeCalculatorController {

	@RequestMapping("/welcome")
	public int name(@RequestParam (name="a") int a,@RequestParam (name="b") int b) {
		
	int c=0;
	c= a+b;
		
		
		return c;
	}
	
	@RequestMapping("/append")
	public String name1() {
		
		String a="6";
		String b="8";
		String c="0";
	
		c = a+b;
		
		
		return c;
	}
}
