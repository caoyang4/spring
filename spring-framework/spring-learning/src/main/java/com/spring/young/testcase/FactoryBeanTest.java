package com.spring.young.testcase;

import com.spring.young.dao.Student;
import com.spring.young.factory.StudentFactoryBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author caoyang
 * @create 2023-10-12 10:29
 */
public class FactoryBeanTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(StudentFactoryBean.class);
		context.refresh();
		Student student = context.getBean(Student.class);
		System.out.println(student);
	}

}
