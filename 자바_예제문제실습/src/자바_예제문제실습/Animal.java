package 자바_예제문제실습;

/*
 캡슐화 원칙에 맞게 구현하기
 //필드
 String 동물이름;
 int 나이;
 
 //메서드
  //Getter
  //Setter
   기본생성자
   필수생성자
   @Override toString 활용해서 문자열 출력하기
 */
public class Animal {

//필드
	private String 호랭이;
	private int 나이;

//기본생성자	
	public Animal() {
		// TODO Auto-generated constructor stub
	}

//필수생성자
	public Animal(String 호랭이, int 나이) {
		super();
		this.호랭이 = 호랭이;
		this.나이 = 나이;
	}

//Setter
	public void set호랭이(String 호랭이) {
		this.호랭이 = 호랭이;
	}

	public void set나이(int 나이) {
		this.나이 = 나이;
	}

//Getter
	public String get호랭이() {
		return 호랭이;
	}

	public int get나이() {
		return 나이;
	}

//toString
	@Override
	public String toString() {
		return "Animal [호랭이=" + 호랭이 + ", 나이=" + 나이 + ", toString()=" + super.toString() + "]";
	}

}
