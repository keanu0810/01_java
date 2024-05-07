package com.kh.serialEx;

import java.io.Serializable;

//�л��� ����ȭ�ϱ�
public class Student implements Serializable{
	private String name;
	private int age;
//�޼���
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
	//�⺻������
	public Student() {
		// TODO Auto-generated constructor stub
	}
	//�ʼ�������
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

