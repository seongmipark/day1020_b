package com.sist.exam06;

import java.util.ArrayList;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> name = new ArrayList<String>();
		name.add("ȫ�浿");
		name.add("������");
		name.add("�̸���");
		name.add("������");
		name.add("������");
		
		for(int i = 0 ;i<name.size();i++) {
		System.out.println("����ڸ��"+ (i+1) +":"+name.get(i));
		}
	}
}
