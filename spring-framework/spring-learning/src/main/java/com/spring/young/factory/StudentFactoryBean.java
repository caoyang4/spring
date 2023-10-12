package com.spring.young.factory;

import com.spring.young.dao.Student;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author caoyang
 * @create 2023-10-12 10:27
 */

public class StudentFactoryBean implements FactoryBean<Student> {

	@Override
	public Student getObject() throws Exception {
		Student student = new Student();
		student.setName("young");
		student.setAge(30);
		return student;
	}

	@Override
	public Class<?> getObjectType() {
		return Student.class;
	}

	@Override
	public boolean isSingleton() {
		return FactoryBean.super.isSingleton();
	}
}
