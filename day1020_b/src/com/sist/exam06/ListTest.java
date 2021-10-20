package com.sist.exam06;

import java.util.ArrayList;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> name = new ArrayList<String>();
		name.add("È«±æµ¿");
		name.add("À¯°ü¼ø");
		name.add("ÀÌ¸ù·æ");
		name.add("¼ºÃáÇâ");
		name.add("±èÀ¯½Å");
		
		for(int i = 0 ;i<name.size();i++) {
		System.out.println("´ë±âÀÚ¸í´Ü"+ (i+1) +":"+name.get(i));
		}
	}
}
