package com.kh.oop.pre;

// 상속 부모 클래스
public class Animal {

// 필드
	private String name;

	
// 메서드
	// Getter
	public String getName() {
		return name;
	}
		
	// Setter
	public void setName(String name) {
		this.name = name;
	}
		
	// 기본 생성자
	public Animal() {
		
	}

	// 필수 생성자
	public Animal(String name) {
		// super(); 부모 클래스에선 필요 없다.
		this.name = name;
	}
	
	// 출력 void
	public void makeSound() {
		System.out.println(name + " 이(가) 소리를 냅니다.");
	}
	
}
