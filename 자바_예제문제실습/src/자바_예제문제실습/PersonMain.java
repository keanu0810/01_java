package 자바_예제문제실습;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class PersonMain {


	public void fileSave(String 파일이름) {
		
		File file = new File(파일이름);
	
	try {
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		Person 사람 = new Person("김영희",10);
		
		
		System.out.println("");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	//PersonMain person.txt 저장
	public static void main(String[] args) {
		PersonMain 사람메인파일만들기 =  new PersonMain();
		사람메인파일만들기.fileSave("person.txt");
	}
}
