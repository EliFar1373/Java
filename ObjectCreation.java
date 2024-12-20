package com.javabasic;

class A{
	
	public A(){
		System.out.println("i am in constructor");
	}
	
	public void show() {
		System.out.println("hiiii show here ");
	}
}

public class ObjectCreation {
	public static void main(String []args) {
//		create a onject
		A obj=new A();
		obj.show();
//		creating reference only
		new A();
		new A().show();
		
	}

}
