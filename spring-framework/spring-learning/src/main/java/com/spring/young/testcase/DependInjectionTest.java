package com.spring.young.testcase;

import com.spring.young.config.Config;
import com.spring.young.dao.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author caoyang
 * @create 2023-10-12 10:17
 */
public class DependInjectionTest {


	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Student student = context.getBean(Student.class);
		System.out.println(student);
	}

}
