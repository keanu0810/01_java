package �ڹ�_���������ǽ�;

import java.util.Scanner;

/*
 ����ڿ��� ���ڿ��� �Է� �޾� ���ڿ��� ���̸� ����ϱ�
 �Է��� ���ڿ��� exit �� ���α׷��� �����ϰ� �ϱ� ����
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("���ڿ��� �Է����ּ���.");
			String str = sc.nextLine();
			if (str.equals("finish") ) {//finish �־����� ���߰� ����� 
				break;
			} else {
				System.out.println(str.length() + "���� �Դϴ�.");
				//.length ()���ڿ��� ���� ���ڼ� ��ȯ �޼���
			}
		}
	
		System.out.println("���α׷��� �����մϴ�.");
		
	}
}
