package com.sist.exam03;

public class StringTestValueOf {

	public static void pro(String str) {
		System.out.println(str);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int data = 2021;
		//pro(data);
		//pro메소드와 같이 string을 매개변수로 받는 메소드가있다면
		//data를 String으로 변환해야 한다
		
		pro(String.valueOf(data));
		pro(data+"");
		
	}

}
