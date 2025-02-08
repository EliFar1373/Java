package com.basic.collection;

import java.util.ArrayList;
import java.util.List;

public class listlearn {
	public static void main(String a[]) {
		List<Integer> nums=new ArrayList<>();
		nums.add(1);
		nums.add(2);
		
		System.out.println(nums);
		System.out.println(nums.get(1));
		for(int n:nums) {
			System.out.println(n);
		}
		
	}

}
