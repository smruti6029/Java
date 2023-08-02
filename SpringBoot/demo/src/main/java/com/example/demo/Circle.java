package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RequestMapping(value="Circle")
@RestController
public class Circle {

	
	
	double r=5.8;

	@GetMapping("/perimeter")
	public String perimeter()
	{
		int r=5;
		return "The Perimeter of Circle   "+2*Math.PI*(r*r);
	}
	
	@GetMapping("/area")
	
	public String area()
	{
		return "The Area of Circle  "+Math.PI*(r*r);
		
	}
}
