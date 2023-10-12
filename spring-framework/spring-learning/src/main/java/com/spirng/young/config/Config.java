package com.spirng.young.config;

import com.spirng.young.dao.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author caoyang
 * @create 2023-10-12 10:11
 */
@Configuration
public class Config {

	@Bean
	public Student getStudent(){
		Student student = new Student();
		student.setName("young");
		student.setAge(30);
		return student;
	}

}
