package Pre.propertiesEx2;

import Pre.propertiesEx.Movies;
//					implements
public class Drama implements Comparable<Movies>{
	private String name;
	private int 출시연도;
	private int 부작;





//메서드
	// Getter
	public String getName() {
		return name;
	}

	public int get출시연도() {
		return 출시연도;
	}

	public int get부작() {
		return 부작;
	}
	
	// Setter
	public void setName(String name) {
		this.name = name;
	}

	public void set출시연도(int 출시연도) {
		this.출시연도 = 출시연도;
	}

	public void set부작(int 부작) {
		this.부작 = 부작;
	}
	
	// 기본생성자
	public Drama() {
		// TODO Auto-generated constructor stub
	}
	
	// 필수생성자

public Drama(String name, int 출시연도, int 부작) {
	super();
	this.name = name;
	this.출시연도 = 출시연도;
	this.부작 = 부작;
}


	// toString
@Override
public String toString() {
	return "Drama [name=" + name + ", 출시연도=" + 출시연도 + ", 부작=" + 부작 + ", toString()=" + super.toString() + "]";
}
	
	// compareto
@Override
public int compareTo(Movies o) {
	
	return 0;
}
}
