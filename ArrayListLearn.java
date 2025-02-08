package com.basic.second;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListLearn {
	public static void main(String []arg) {
		
		Collection<Integer> num=new ArrayList<Integer>();
		num.add(1);
		num.add(2);
		num.add(3);
		
		System.out.println(num);
		for(int nm:num) {
			System.out.println(nm*2);
		}
	}

}
