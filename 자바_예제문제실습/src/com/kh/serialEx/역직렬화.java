package com.kh.serialEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class ������ȭ {
	public static void main(String[] args) {
		//����ȭ�� ���� �ҷ�����
		String �����̸� = "student.txt";
		
		try {
			FileInputStream fis = new FileInputStream(�����̸�);
			ObjectInputStream ois = new ObjectInputStream(fis);
			//���Ͽ��� ��ü�� ������ȭ�ؼ� �о��
			Student �л� = (Student) ois.readObject();
		
			System.out.println("���Ϸκ��� ��ü�� ������ȭ�߽��ϴ�.");
			System.out.println("������ȭ�� �л� txt" + �л�);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
