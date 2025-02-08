package com.basic.collection;

import java.util.HashSet;
import java.util.Set;

public class setlearn {
	public static void main(String[] args) {
//	HashSet is not giving ordered list	
		Set<Integer> nums=new HashSet<Integer>();
		
		nums.add(1);
		nums.add(2);
		System.out.println(nums);
		for(int n:nums) {
			System.out.println(n);
			
			
		}
		
		
	}

}


