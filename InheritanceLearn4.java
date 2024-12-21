package com.learn;

class A1 {
	
	public A1() {
		super();
		System.out.println("constructor in A");
	}
	
}

class B1 extends A1{
	
	
	
	public B1() {
	    super();  // Recursive call to the same constructor
	    System.out.println("constructor in B");
	}

	public B1(int n) {
		this();
		System.out.println("in B int");
	}
	
}

public class InheritanceLearn4 {
	public static void main(String []args) {
		
//		if we want to call both parameterze and defualt constructor of a class we sue this(_)
		B1 obj=new B1(2);
		System.out.println("new one:");
		B1 obj2=new B1();
//		when you creat a object we call both constructor of class and extend class
//		every class in java written or not has extends to object class and super is constructor of this class
		
	}

}






