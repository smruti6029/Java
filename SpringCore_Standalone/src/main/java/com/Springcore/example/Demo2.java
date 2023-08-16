package com.Springcore.example;

import org.springframework.beans.factory.annotation.Autowired;

public class Demo2 {
	
	@Autowired
	private Demo Demo;

	public Demo2(com.Springcore.example.Demo demo) {
		super();
		Demo = demo;
	}

	@Override
	public String toString() {
		return "Demo2 [Demo=" + Demo + "]";
	}

	public Demo2() {
		super();
	}
	


}
