//사용자에게 년도와 월을 입력받아
//해당 년도와 월의 달력을 출력하는 프로그램 작성

package com.sist.exam06;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
 		int userYear,userMonth;
		
 		System.out.print("년도를 입력하세요 ==>");
		userYear = sc.nextInt();
 		
		System.out.print("월을 입력하세요 ==>");
		userMonth = sc.nextInt();

		
		System.out.printf("%d년 %d월\n",userYear , userMonth);
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		
		//이달의 1일의 요일을 알기 위해
		Calendar startdate = Calendar.getInstance();
		startdate.set(userYear, userMonth-1 , 1 ); //month는 1월이 0부터시작.
		
		int day = startdate.get(Calendar.DAY_OF_WEEK)-1;
		
		//그 달의 1일의 요일만큼 빈칸을 출력
		for(int i = 1 ; i <= day ; i++) {
			System.out.print("\t");
		}
		
		//달력의 날짜를 제대로 출력하도록 코드 수정
		int []lastDate = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		for(int i = 1 ; i<=lastDate[userMonth-1] ; i++) {
			System.out.print(i + "\t");
				if((i+day) % 7 == 0) {
					System.out.println();	
				}
 		
	}

		}
	}
