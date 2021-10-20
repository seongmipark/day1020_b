package com.sist.exam05;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Calendar today = new CalendarTest();
		//Calendar은 객체를 바로 생성할 수 없다
		
		
		//getInstance()을 이용하여 객체를 생성한다.
		//Calendar today = Calendar.getInstance();
		GregorianCalendar today = new GregorianCalendar();
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH);
		int date = today.get(Calendar.DAY_OF_MONTH);
		
		System.out.printf("오늘은 %d년 %d월 %d일입니다.",year,month+1,date);
	
		
	
	
	}

}
