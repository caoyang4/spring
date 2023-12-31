package com.spring.young.testcase;

import com.spring.young.dao.Student;
import com.spring.young.selector.StudentImportSelector;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;

/**
 * @author caoyang
 * @create 2023-10-12 10:38
 */
@Import(StudentImportSelector.class)
public class ImportSelectorTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(ImportSelectorTest.class);
		context.refresh();
		Student student = context.getBean(Student.class);
		System.out.println(student);
	}

}
