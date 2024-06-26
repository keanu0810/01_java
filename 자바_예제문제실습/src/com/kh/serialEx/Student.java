package com.kh.serialEx;

import java.io.Serializable;

//학생을 직렬화하기
public class Student implements Serializable{
	private String name;
	private int age;
//메서드
	//Getter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	
	//Setter
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//기본생성자
	public Student() {
		// TODO Auto-generated constructor stub
	}
	//필수생성자
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	//toString
	@Override
	public String toString() {
		return "Student  "+ name + ", age=" + age;
	}
}

