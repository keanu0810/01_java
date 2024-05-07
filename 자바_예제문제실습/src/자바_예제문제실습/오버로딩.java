package 자바_예제문제실습;
/*
 빨간선이 뜨는 부분을 해결하기
 * */
public class 오버로딩 {
	public void test() {
	}

	public void test(String str) {
	}

	public void test(int i) {
	}

	public void test(String s, String v) {
	}

	private void test(int a, int b) {
	}

	public void test(char a, char b) {
	}

	void test(char ch) {
	}
	public void test(boolean a) {}
	public void test(boolean b, char c) {}
	public void test(short s) {}
	public void test(short c, String a) {}
	
	public void test(int a, String b) {}
	public void test(int a, String b, short c) {}
	
	public void test(String c, int b) {}
	public void test(String c, int b, int a ) {}

	public void test(boolean a, boolean b) {}
	public void test(boolean a, boolean b, String c) {}
	

}
