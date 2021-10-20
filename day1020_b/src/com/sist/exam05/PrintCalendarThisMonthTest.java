package com.sist.exam05;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

//Calendar나 GregorianCalendar로 이용해보자

public class PrintCalendarThisMonthTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1부터 31까지를 모두 출력해보기
		//단 , 한줄에는 7개의 숫자만 출력하도록.

		/*	
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH);
		int date = today.get(Calendar.DAY_OF_MONTH);
		 */
		
		GregorianCalendar today = new GregorianCalendar();
		//Date today = new Date();
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH);
		

		//이달의 1일의 요일을 알기 위해
		GregorianCalendar startdate = new GregorianCalendar(year,month,1);

		int day = startdate.get(Calendar.DAY_OF_WEEK)-1;//일요일이 1부터 시작
		
		System.out.printf("%d년 %d월\n",year , month+1);
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		//그 달의 1일의 요일만큼 빈칸을 출력
		for(int i = 1 ; i<=day ; i++) {
			System.out.print("\t");
		}
		
		//달력의 날짜를 제대로 출력하도록 코드 수정
		int []lastDate = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		for(int i = 1 ; i<=lastDate[month] ; i++) {
			System.out.print(i + "\t");
				if((i+day)%7 == 0) {
					System.out.println();					
				}
			}
		}
	}

