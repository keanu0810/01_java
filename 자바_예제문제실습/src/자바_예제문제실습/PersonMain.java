package �ڹ�_���������ǽ�;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class PersonMain {


	public void fileSave(String �����̸�) {
		
		File file = new File(�����̸�);
	
	try {
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		Person ��� = new Person("�迵��",10);
		
		
		System.out.println("");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	//PersonMain person.txt ����
	public static void main(String[] args) {
		PersonMain ����������ϸ���� =  new PersonMain();
		����������ϸ����.fileSave("person.txt");
	}
}
