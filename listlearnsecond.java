package com.basic.collection;


import java.util.Set;
import java.util.TreeSet;

public class listlearnsecond {

	
		public static void main(String[] args) {
//		HashSet is not giving ordered list	but TreeSet is giving ordered list
			Set<Integer> nums=new TreeSet<Integer>();
			
			nums.add(1);
			nums.add(2);
			
			for(int n:nums) {
				System.out.println(n);
				
				
			}
			
			
		}

	}


