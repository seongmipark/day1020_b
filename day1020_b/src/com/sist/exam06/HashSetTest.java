package com.sist.exam06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   
	    int[] num = {1,1,2,3,4,5,5,6};
	    
        HashSet<Integer> hashSet = new HashSet<>();
        for(int s : num){
            hashSet.add(s);
        }

        System.out.println(hashSet);
		
	}

}
