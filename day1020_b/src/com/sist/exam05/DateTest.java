package com.sist.exam05;

import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Date today = new Date();
		int year = today.getYear()+1900;
		int month = today.getMonth()+1;
		int date = today.getDate();
		int hours = today.getHours();
		int minutes = today.getMinutes();
		int seconds = today.getSeconds();
		int day = today.getDay();
		
		String []arr = {"일","월","화","수","목","금","토"};
		String yoil = arr[day];
		
		//코드에 취소선이 그어지는 것은
		//date보다 calendar나 GregorianCalendar를 사용하기를 권장해서 그렇다
				
		System.out.println(day);
		System.out.printf("현재는 %d년 %d월 %d일(%s요일) %d시 %d분 %d초 입니다.\n",year,month,date,yoil,hours,minutes,seconds);
		
		System.out.println("=====================================");

		
		//이건우가 태어난 1995년 7월 29일은 무슨요일?

		int birthYear = 1995;
		int birthMonth = 7;
		int birthDate = 29;
		
		Date leeDate = new Date(birthYear-1900, birthMonth-1,birthDate);
		int day2 = leeDate.getDay();
		
	    System.out.printf("이건우가 태어난 날은 %s요일 입니다.",arr[day2]);
	
	}

}
