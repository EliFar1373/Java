package com.learn;

final class Calc2{
	
	public void show() {
		System.out.println("hi i show");
	}
	
	public void add(int a,int b) {
		System.out.println(a+b);
		
	}
		
}

//  we cannot extends final class 
// we can not change final variable
//class Bh extends Calc2{} we can not 

public class FinalClass{
	public static void main(String []arg) {
		Calc2 cl=new Calc2();
		cl.show();
		cl.add(2, 30);
		
		
	}

}
