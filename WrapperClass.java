package com.learn;


public class WrapperClass {
	public static void main(String []arg) {
		
		int nm=5; // primitive
		Integer num1=nm; //autoboxing, assign primitive value in obj , num1:obj , nm:primitive
		 
		
		int num2=nm; //auto-unboxing , take out primitive value from obj
		
//		Integer and Double are class
		
		
		String nm3="1";
		int nm4=Integer.parseInt(nm3);
		System.out.println(nm4);
		
		
		
		
	}

}
