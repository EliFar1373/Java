package com.learn;

//  final variable: we can not chnage it, make it constant
//  final class: not allowing inheritance
// final method: stop overwritting
class Calc3{
	
	public final void show() {
		System.out.println("hi i show");
	}
	public void add(int a,int b) {
		System.out.println(a+b);
	}	
}

//  to avoid method overrwriting, we use final methhod

class AdvCalc2 extends Calc3{
////	public  void show() {
//		System.out.println("hi in addcalcu");	
//	}
}




public class FinalMethod {
    public static void main(String []arg) {
    	 AdvCalc2 cl=new  AdvCalc2();
		cl.show();
		cl.add(2, 30);
	
	}
}








