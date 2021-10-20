package com.sist.exam05;

import java.util.Date;

public class PrintCalendarThisMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1���� 31������ ��� ����غ���
		//�� , ���ٿ��� 7���� ���ڸ� ����ϵ���.
		
		Date today = new Date();
		int year = today.getYear();
		int month = today.getMonth();
		
		//�̴��� �޷��� ����ϱ� ���Ͽ�
		//�̴��� 1���� ������ �ݿ����̶�� �տ� ��ĭ�� 5�� ����ϰ�
		//��¥�� ����ؾ� �Ѵ�.
		//�׷��� �̴��� 1���� ������ �˱� ���Ͽ� �̴��� 1���� Date��ü�� ����
		Date startDate = new Date(year,month,1);
		
		int day = startDate.getDay();
		
		System.out.printf("%d�� %d��\n",year+1900 , month+1);
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

