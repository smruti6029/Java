package com.Springcore;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Student {

		private List<String>  subject;
		
		private Map<String,Integer> course;
		
		private Properties properties;
		

		public Properties getProperties() {
			return properties;
		}

		public void setProperties(Properties properties) {
			this.properties = properties;
		}

		public List<String> getSubject() {
			return subject;
		}

		public void setSubject(List<String> subject) {
			this.subject = subject;
		}

		public Student(List<String> subject) {
			super();
			this.subject = subject;
		}

		
		public Map<String, Integer> getCourse() {
			return course;
		}

		public void setCourse(Map<String, Integer> course) {
			this.course = course;
		}

		

		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Student(List<String> subject, Map<String, Integer> course) {
			super();
			this.subject = subject;
			this.course = course;
		}

		@Override
		public String toString() {
			return "Student [subject=" + subject + ", course=" + course + ", properties=" + properties + "]";
		}

		
		
		
		
}
