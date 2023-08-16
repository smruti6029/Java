package com.configuration.student;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.Dao.Student.StudentDao;
import com.Dao.Student.StudentDaoImp;

@Configuration
@ComponentScan(basePackages = "com.Dao.Student")
public class javConfiguration {
	
	@Bean
	public DataSource getDataSource()
	{
		DriverManagerDataSource ds =new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/spring_core");
		ds.setUsername("root");
		ds.setPassword("password");
		
		return ds;
	}
	@Bean
	public JdbcTemplate getTemplate()
	{
		JdbcTemplate jdbcTemplate=new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
		
	
	}
//	@Bean
//	public StudentDao getStudentDao()
//	{
//		StudentDaoImp studentDaoimp=new StudentDaoImp();
//		studentDaoimp.setJdbcTemplate(getTemplate());
//		return studentDaoimp;
//	}

}
