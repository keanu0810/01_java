package com.kh.NumberSystem;

public class ���ڽý��� {
	public static void main(String[] args) {
		
		int ���� = 42; //������
		
		//42 ��� ���ڸ� 2������ ��ȯ
					//������ �� ���� -> ���ڿ��� ��ȯ�ؼ� ��� ����ؼ� �������� String ��ȯ
		String ������ = Integer.toBinaryString(����);
		System.out.println(������);
		
		//42 ��� ���ڸ� 8������ ��ȯ
		String ������ = Integer.toOctalString(����);
		System.out.println(������);
				
		//42��� ->2������ ��ȯ�� ���� �����ͼ� ���ڸ� 10������ ��ȯ
		String ������2= "101010";//42
		int ������ = Integer.parseInt(������2, 2);
		System.out.println(������);
		
		// (2~16) � ���� -> ������ ���ʹ� parseInt�� ����ؼ� ����
		
		// �������� ������ ��ȯ
		String ������2 = "52";//8���� 52 == 42
		/*
		 //�� �� ǥ��� �� ����
		 		4		2
		     4 * 8��   2 * 8��0��
		        32		2
		        �������� �������� �����ϸ� 52
		 */
		int		������2 = Integer.parseInt(������2, 8);
		System.out.println(������2);
		
		//���������� �������� ��ȯ
		String �������� = "2A";
		/*
		 16�������� 'A' �� 10 '2' �� 2
		 2A16 = 2 X 16�� + A X 16
		 2A16 = 2 * 16 + 10 X 16 = 2 * 16 + 10 *1 =32 + 10 =42
		 
		 * */
		int ������3 = Integer.parseInt(��������, 16);
		System.out.println(������3);
		
	}
}
