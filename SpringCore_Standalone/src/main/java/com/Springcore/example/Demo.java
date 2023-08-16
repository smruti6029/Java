package com.Springcore.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	
	@Value("#{10+20}")
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public Demo(int num) {
		super();
		this.num = num;
	}

	@Override
	public String toString() {
		return "Demo [num=" + num + "]";
	}

	public Demo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
