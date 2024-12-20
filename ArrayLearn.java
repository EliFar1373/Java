package javaVasic3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayLearn {
	public static void main(String []args) {
		
		int num[]= {1,2,3,4};
//		System.out.println(num); it deos not work do the follwoing:
		System.out.println(Arrays.toString(num));
		
		for(int i:num) {
			System.out.println(i);
		}
		
		
		System.out.println("number one"+num[1]);
		
		
		int []num2=new int[3];
		System.out.println("here test"+num2[0]);
		num2[0]=4;
		num2[1]=1;
		num2[2]=3;
		System.out.println("here test two"+num2[0]);

		
		
		for(int i=0;i<num2.length;i++) {
			System.out.println("here i am "+num2[i]);
			
			
		}
		
		
		
		
		
		
		
		
		
		int [][]liss= {{1,2},{3,4}};
		
		
		for(int[] i:liss) {
			for(int j:i) {
				System.out.println(j);
			}
		}
		
		
		for(int[] i:liss) {
			System.out.println(Arrays.toString(i));
		}
		
		

		
		
		
		
		
		List<Integer> list1=new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		System.out.println(list1);
		
		
		
		


		
		
	}
	


}
