package com.sist.exam04;

public class StringBufferReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer data = new StringBuffer("hello korea");
		//"hello"f를 "hi"로 변경
		
		//data.replace(0,5,"hi");
		//System.out.println(data);
		
		//다른방법으로 해보자
		String oldString = "hello"; // hello문자열을 찾아서
		String newString = "hi"; // hi로 바꾸자
		
		//data로부터 oldString의 위치를 알아내보기
		int start = data.indexOf(oldString);
		
		int end = start + oldString.length();
		data.replace(start, end, newString);
		System.out.println(data); // hi korea
		
	}

}
