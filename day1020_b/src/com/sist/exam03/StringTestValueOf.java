package com.sist.exam03;

public class StringTestValueOf {

	public static void pro(String str) {
		System.out.println(str);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int data = 2021;
		//pro(data);
		//pro�޼ҵ�� ���� string�� �Ű������� �޴� �޼ҵ尡�ִٸ�
		//data�� String���� ��ȯ�ؾ� �Ѵ�
		
		pro(String.valueOf(data));
		pro(data+"");
		
	}

}
