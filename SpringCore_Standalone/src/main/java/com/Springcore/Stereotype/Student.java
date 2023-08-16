package com.Springcore.Stereotype;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("student")
public class Student {

		@Value("#{List}")
		private List<String>  subject;
		
		@Value("#{Map1}")
	    private Map<String, Integer> course;
		
		
		@Value("#{prop}")
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
