package com.learn;



@FunctionalInterface
interface KK{
	void show();
}
class BBB implements KK{
	public void show() {
		System.out.println("in show");
	}
}

public class FunctionalInterfaceleran {
	public static void main(String []arg) {
		KK obj=new BBB();
		obj.show();
		
	}
	

}
//A functional interface in Java is an interface that has
//exactly one abstract method (although it can have multiple 
//default or static methods). The purpose of a functional
//interface is to enable lambda expressions or method references 
//in Java, which allows for 
//a more concise and expressive way to handle single-method interfaces.
