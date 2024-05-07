package com.kh.datePre;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePre2 {
	public static void main(String[] args) {
		Date now = new Date();
		// 날짜 형식 0000년 00월 00일
		// 연 월 일 형식으로 -이외 / _ 글자를 넣게 되면 자동으로 시 분 초 는 값을 읽어오지 못함
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/ MM/ dd/ EEEE");

		// 날짜를 문자열로 format형식
		String dateString = sdf.format(now);
		// 출력
		System.out.println(dateString);
		// 문자열을 날짜로 parse를 사용해서 변경

		try {
			Date paredDate = sdf.parse(dateString);
			System.out.println(paredDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
