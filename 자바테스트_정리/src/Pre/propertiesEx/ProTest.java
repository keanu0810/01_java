package Pre.propertiesEx;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ProTest {
	public static void fileSave(Properties p) throws IOException {
		//Properties 에 XML 파일로 내용 저장하기
		
		p.setProperty("1", "패밀리맨,4,2000");
		p.setProperty("2", "엘리멘탈,5,2023");
		p.setProperty("3", "투모로우,5,2004");
		
		FileOutputStream fos= new FileOutputStream("movies.xml");
		p.storeToXML(fos, null);
		fos.close();
		
		
		
		
	}
public static void main(String[] args) throws IOException {
	Properties p = new Properties();
	fileSave(p);
}
}
