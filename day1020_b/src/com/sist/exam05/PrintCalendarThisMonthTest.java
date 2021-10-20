package com.sist.exam05;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

//Calendar�� GregorianCalendar�� �̿��غ���

public class PrintCalendarThisMonthTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1���� 31������ ��� ����غ���
		//�� , ���ٿ��� 7���� ���ڸ� ����ϵ���.

		/*	
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH);
		int date = today.get(Calendar.DAY_OF_MONTH);
		 */
		
		GregorianCalendar today = new GregorianCalendar();
		//Date today = new Date();
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH);
		

		//�̴��� 1���� ������ �˱� ����
		GregorianCalendar startdate = new GregorianCalendar(year,month,1);

		int day = startdate.get(Calendar.DAY_OF_WEEK)-1;//�Ͽ����� 1���� ����
		
		System.out.printf("%d�� %d��\n",year , month+1);
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		
		//�� ���� 1���� ���ϸ�ŭ ��ĭ�� ���
		for(int i = 1 ; i<=day ; i++) {
			System.out.print("\t");
		}
		
		//�޷��� ��¥�� ����� ����ϵ��� �ڵ� ����
		int []lastDate = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		for(int i = 1 ; i<=lastDate[month] ; i++) {
			System.out.print(i + "\t");
				if((i+day)%7 == 0) {
					System.out.println();					
				}
			}
		}
	}

