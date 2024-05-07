package com.kh.BasicEx;

// 안 쓰는 것들을 청소해서 정리하는 것
/*
 Garbage : 쓰레기
 Collection : 수집
  더이상 사용되지 않는 객체나 변수를 자동으로 정리하는 방식을 의미한다. 
 */
public class 가비지컬렉터 {
	
	// 메인 메서드를 들어가기 전, 필드에 작성하는 변수가 전역 변수이다.
	
	public static void main(String[] args) {
		// { } 안에 작성한 변수들은 지역 변수이다.
		String 주소 = "https://";
		System.out.println(주소);
		       주소 += "www.naver.com/";
		System.out.println(주소);
	}
	
}
