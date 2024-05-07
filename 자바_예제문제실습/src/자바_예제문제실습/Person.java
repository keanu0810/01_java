package 자바_예제문제실습;

/*
 캡슐화
 String 사람이름 김영희
 int 나이 10
 생성자 모두 만들기
 toString 출력
 
 PersonMain person.txt 저장
 * */
public class Person {
	private String 이름;
	private int 나이;

//생성자
	public Person() {
		// TODO Auto-generated constructor stub
	}

//필수생성자
	public Person(String 이름, int 나이) {
		super();
		this.이름 = 이름;
		this.나이 = 나이;
	}

//Setter

	public void set이름(String 이름) {
		this.이름 = 이름;
	}

	public void set나이(int 나이) {
		this.나이 = 나이;
	}

//Getter
	public String get이름() {
		return 이름;
	}

	public int get나이() {
		return 나이;
	}

	@Override
	public String toString() {
		return "Person [이름=" + 이름 + ", 나이=" + 나이 + ", toString()=" + super.toString() + "]";
	}

}
