package com.spring.young.lifecycle;

import com.spring.young.dao.Student;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author caoyang
 * @create 2023-10-12 15:37
 */
@Component
public class StudentLifeInit implements InitializingBean {

	@Autowired
	private Student student;

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println(student);
		System.out.println("InitializingBean接口起作用，afterPropertiesSet方法被调用了");
		student.setAge(30);
		student.setName("cy");
		System.out.println(student);
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
}
