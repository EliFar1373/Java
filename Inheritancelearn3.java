package com.learn;

class A{
	public A() {
		System.out.println("constructor in A");
	}
	
}
class B extends A{
	
	public B() {
		System.out.println("constructor in B");
	}
	public B(int n) {
		System.out.println("in B int");
	}
	
}
public class Inheritancelearn3 {
	public static void main(String []args) {
		B obj=new B(2);
		System.out.println("new one:");
		B obj2=new B();
//		when you creat a object we call both constructor of class and extend class
		
	}

}
