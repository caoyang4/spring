package com.spring.young.config;

import com.spring.young.dao.Student;
import com.spring.young.selector.StudentImportSelector;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author caoyang
 * @create 2023-10-12 10:11
 */
@Configuration
@Import(StudentImportSelector.class)
public class Config {

	@Bean
	public Student student(){
		Student student = new Student();
		student.setName("young");
		student.setAge(30);
		return student;
	}

}
