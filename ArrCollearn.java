package com.basic.collection;
import java.util.ArrayList;
import java.util.Collection;

public class ArrCollearn {
	public static void main(String a[]) {
	Collection <Integer> nums=new ArrayList<>();
	nums.add(1);
	nums.add(2);
	nums.add(3);
	
	 System.out.println(nums);
	 
	 System.out.println(((ArrayList<Integer>)nums).get(1));
	 
	 for(int n:nums) {
		 System.out.println(n);
		 
	
	 }

}
}

