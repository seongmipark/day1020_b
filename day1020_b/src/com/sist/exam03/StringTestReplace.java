package com.sist.exam03;

import java.util.Scanner;

public class StringTestReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String data;
		System.out.println("���ڿ��� �Է��Ͻÿ� ==>");
		data = sc.next();
		data = data.replace("hello", "�ȳ�"); //�����ϰ� �ٽ� data�� ��ƾ��Ѵ�.
		System.out.println(data);
	}

}
