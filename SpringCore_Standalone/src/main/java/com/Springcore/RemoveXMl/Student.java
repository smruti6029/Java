package com.Springcore.RemoveXMl;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("student")
public class Student {

		@Value("Raja")
		private String name;
		
		@Value("22")
		private int number;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getNumber() {
			return number;
		}

		public void setNumber(int number) {
			this.number = number;
		}

		public Student(String name, int number) {
			super();
			this.name = name;
			this.number = number;
		}

		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public void name() {
			System.out.println("Inside Sudent Class");
			
		}

		@Override
		public String toString() {
			return "Student [name=" + name + ", number=" + number + "]";
		}
		
		
		
}
