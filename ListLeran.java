package com.basic.second;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListLeran {
	public static void main(String []arg) {
		
		List<Integer> num=new ArrayList<Integer>();
		num.add(1);
		num.add(2);
		num.add(3);
		
//		list you get use index to extract element compare to Collection
		System.out.println(num.get(0));
//		get index 
		System.out.println(num.indexOf(1));
		System.out.println(num);
		for(int nm:num) {
			System.out.println(nm*2);
		}
	}

}
