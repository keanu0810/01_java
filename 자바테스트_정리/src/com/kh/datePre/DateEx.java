package com.kh.datePre;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		//Date는 최초 1회만 호출 Date now - new Date();
		Date now = new Date();
		// 연-월-일 출력하기
		//SimpleDateFormat sdf1 = new SimpleDateFormat();
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		String formatDate1 = sdf1.format(now);
		String formatDate2 = sdf2.format(now);
		String formatDate3 = sdf3.format(now);
		
		
		System.out.println(formatDate1);
		System.out.println(formatDate2);
		System.out.println(formatDate3);
		
		String 문자열1 = "2019-09-14";
		String 문자열2 = "03:46:52";
		String 문자열3 = "2019-09-14 03:46:52";
		
		try {
			Date 소1 = sdf1.parse(문자열1);
			System.out.println(소1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Date 소2 = sdf2.parse(문자열2);
			System.out.println(소2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Date 소3 = sdf3.parse(문자열3);
			System.out.println(소3);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
