package com.spring.young.testcase;

import com.spring.young.dao.Student;
import com.spring.young.definition.StudentBeanDefinitionRegistrar;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;

/**
 * @author caoyang
 * @create 2023-10-12 15:33
 */
@Import(StudentBeanDefinitionRegistrar.class)
public class ImportBeanDefinitionRegistrarTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(ImportBeanDefinitionRegistrarTest.class);
		context.refresh();
		Student student = context.getBean(Student.class);
		System.out.println(student);
	}

}
