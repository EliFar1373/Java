package com.learn;

interface H{
//	all methods in interface are public abstract 
//	public abstract
//	we can create a reference A obj; but we can not create object new A()
	
	
	void show();
	void fly();
	
//	variable are final and static : final means we can not assign another value, static: we can call variable 
//	without calling obj see below 
	
	int age=20;
}

class BB implements H{
	public void show() {
		System.out.println("show");
	}
	public void fly() {
		System.out.println("fly");
	}
}

public class InterfaceLearn1 {
	public static void main(String []arg) {
		
		H obj1= new BB();
		obj1.show();
//		YOUO CAN NOT do that final
//		H.age=60;
//		call variable 
		System.out.println(H.age);
		
		
	}

}
