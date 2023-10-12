package com.spirng.young.dao;

/**
 * @author caoyang
 * @create 2023-10-12 10:12
 */
public class Student {

	private String name;

	private Integer age;

	private String address;

	private Double grade;

	private String classNumber;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Double getGrade() {
		return grade;
	}

	public void setGrade(Double grade) {
		this.grade = grade;
	}

	public String getClassNumber() {
		return classNumber;
	}

	public void setClassNumber(String classNumber) {
		this.classNumber = classNumber;
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", age=" + age +
				", address='" + address + '\'' +
				", grade=" + grade +
				", classNumber='" + classNumber + '\'' +
				'}';
	}
}
