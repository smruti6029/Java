package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@RequestMapping(value=("test"))
@RestController
public class test {

	
	
	
	@GetMapping("/")
	public String show() 
	{
		
		return "Hello  WOrld";
	}
}
