package com.sist.exam05;

import java.util.Date;

public class System_CurrentTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long data = System.currentTimeMillis();
		//���� ��¥�� �ð��� ������ �и��������� �о�´�.
		
		System.out.println(data);
		//��¥�� ���� �뵵�ε� ��������
		//��������� �뵵�ε� ���δ�
		
		Date today = new Date(data);
		
		//long data2 = 1634715380556;
		//�ڹٴ� �������� ���� ���� ������ int�� ����Ͽ� int�� ������ �Ѿ��ٰ� ��������.
		//���������� long�� ǥ���ϱ� ���� ���̻� l�� ���δ�.
		long data2 = 1634715380556l;
		Date date = new Date(data2);
		
		System.out.printf("���� �ð� : %d�� %d�� %d��\n",today.getHours(),today.getMinutes(),today.getSeconds());
		System.out.printf("�Ʊ��� �ð� : %d�� %d�� %d��",date.getHours(),date.getMinutes(),date.getSeconds());
	}

}
