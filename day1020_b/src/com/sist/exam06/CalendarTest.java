//����ڿ��� �⵵�� ���� �Է¹޾�
//�ش� �⵵�� ���� �޷��� ����ϴ� ���α׷� �ۼ�

package com.sist.exam06;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
 		int userYear,userMonth;
		
 		System.out.print("�⵵�� �Է��ϼ��� ==>");
		userYear = sc.nextInt();
 		
		System.out.print("���� �Է��ϼ��� ==>");
		userMonth = sc.nextInt();

		
		System.out.printf("%d�� %d��\n",userYear , userMonth);
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		
		
		//�̴��� 1���� ������ �˱� ����
		Calendar startdate = Calendar.getInstance();
		startdate.set(userYear, userMonth-1 , 1 ); //month�� 1���� 0���ͽ���.
		
		int day = startdate.get(Calendar.DAY_OF_WEEK)-1;
		
		//�� ���� 1���� ���ϸ�ŭ ��ĭ�� ���
		for(int i = 1 ; i <= day ; i++) {
			System.out.print("\t");
		}
		
		//�޷��� ��¥�� ����� ����ϵ��� �ڵ� ����
		int []lastDate = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		for(int i = 1 ; i<=lastDate[userMonth-1] ; i++) {
			System.out.print(i + "\t");
				if((i+day) % 7 == 0) {
					System.out.println();	
				}
 		
	}

		}
	}
