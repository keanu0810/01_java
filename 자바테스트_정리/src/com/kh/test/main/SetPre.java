package com.kh.test.main;

import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.LinkedHashSet;

// set 은 인터페이스 이기 때문에, 단독으로 사용하지 못한다.
// Set 셋 = new Set<>(); 은 쓰지 못한다.
// Set 셋 = new HashSet<>(); 은 쓸 수 있다.
public class SetPre {
	
	public static void main(String[] args) {
	
		Set<String> set1 = new HashSet<>();
		
		set1.add("사과");
		set1.add("바나나");
		set1.add("오렌지");
		
		System.out.println("해시 셋 : " + set1);
		
		Set<Integer> set2 = new TreeSet<>();
		
		set2.add(5);
		set2.add(2);
		set2.add(8);
		
		System.out.println("트리 셋 : " + set2);
		
		Set<String> set3 = new LinkedHashSet<>();
		
		set3.add("영화");
		set3.add("드라마");
		set3.add("스포츠");
		
		System.out.println("링크드 해시 셋 : " + set3);
		
		// .clear() .remove() .isEmpty() 는 쓸 수 있지만,
		// .set() .get() 을 써서 값을 수정하거나, 가져올 수 없다.
		
	}
	
}
