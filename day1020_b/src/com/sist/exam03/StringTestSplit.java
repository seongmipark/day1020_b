package com.sist.exam03;

import java.util.StringTokenizer;

public class StringTestSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String data =  "ȫ�浿/20/����/010-1234-5678";
		String []arr = data.split("/");
		for(int i = 0 ;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("==================================");
		StringTokenizer st = new StringTokenizer(data, "/");
		while(st.hasMoreTokens()){
			String str = st.nextToken();
			System.out.println(str);
		}
	}
}
