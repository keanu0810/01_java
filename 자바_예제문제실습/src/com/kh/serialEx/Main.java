package com.kh.serialEx;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Main {
	public static void main(String[] args) {
		//����ȭ�� �����͸� ������ ���� ���
		String �����̸� = "student.txt";
		
		//����ȭ�ؼ� ������ ��ü ����
		Student �л� = new Student("�ڸ���",30);
		
		//��ü�� ���Ϸ� ����ȭ�ϴ� �ڵ�
		
		try {
			FileOutputStream fos = new FileOutputStream(�����̸�);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			//��ü�� ����ȭ�ؼ� ���� �ۼ��ϱ�
			oos.writeObject(�л�);
			oos.close();
			System.out.println("��ü�� �����Ͽ� ���Ͽ� ����Ǿ����ϴ�.");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
