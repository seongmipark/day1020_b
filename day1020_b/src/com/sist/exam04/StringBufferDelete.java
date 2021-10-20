package com.sist.exam04;

public class StringBufferDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer data = new StringBuffer("hello java");
		data.deleteCharAt(5); //인덱스 5번에 있는 공백을 지워보자.
		System.out.println(data);  //data = hellojava
		
		data.delete(3,5);
		System.out.println(data); // data = heljava
	}
}
