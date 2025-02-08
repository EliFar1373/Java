package com.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;


public class SortExample {
	public static void main(String [] args) {
		
		List<Integer> nums=new ArrayList<>();
		nums.add(12);
		nums.add(2);
		nums.add(24);
		nums.add(8);
		
		
		
		
//		have own logic for sorting
		Comparator <Integer>com=new Comparator<Integer>() {
			public int compare(Integer i, Integer j) {
//				swap 
				if (i%10>j%10)
					return 1;
//				not swap
				else     
					return -1;
			}
		};
//	do the sorting 
//		before
		System.out.println(nums);
		
		Collections.sort(nums,com);
//		after
		System.out.println(nums);
// sorting without using out own preferences		
		Collections.sort(nums);
		System.out.println(nums);
		
		
	}

}
