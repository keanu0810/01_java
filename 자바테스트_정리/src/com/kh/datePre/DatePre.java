package com.kh.datePre;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePre {
	public static void main(String[] args) {
		//현재 날짜와 시간
		Date now = new Date();
		
		System.out.println(now);
		// Fri May 03 10:29:31 KST 2024 형식을
		
		//문자열(SimpleDateFormat - String) -> 날짜(Date) 변경
		//Date parseDate2
		
		
		
		//우리가 우너하는 형식으로 변경 SimpleDateFormat 사용해서 변경
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		//now로 받은 날짜를 문자열로 SimpleDateFormat 사용해서 변경
		String formatDate = sdf.format(now);
		System.out.println("날짜 형식변경 : " + formatDate);
		
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy / MM / dd");
		String formatSdf2 = sdf2.format(now);
		System.out.println(formatSdf2);
		
		//문자열(SimpleDateFormat-String을 날짜(Date)로 변경
		

	}
}
