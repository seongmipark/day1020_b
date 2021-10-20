package com.sist.exam03;

import java.util.Scanner;

public class StringTestReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String data;
		System.out.println("문자열을 입력하시오 ==>");
		data = sc.next();
		data = data.replace("hello", "안녕"); //변경하고 다시 data에 담아야한다.
		System.out.println(data);
	}

}
