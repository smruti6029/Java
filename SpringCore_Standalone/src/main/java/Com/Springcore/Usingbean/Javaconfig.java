package Com.Springcore.Usingbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Javaconfig {
	
	
	@Bean
	public Teacher getTeacher()
	{
				return new Teacher();
		
	}
	
	
	@Bean
	public Student getStudent()
	{
		Student student =new Student(getTeacher());
		return student;
	}
	
	
	
	
}
	

								
