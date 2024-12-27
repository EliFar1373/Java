package com.learn;

abstract class Bird{
	public abstract void fly();
}

public class AbstractAndAnonymousInnerClass {
	public static void main(String []arg) {
		
		Bird obj=new Bird() {
			
			public void fly() {
				System.out.println("flyyy");	
			}
		};
		
		obj.fly();
		
	}

}

// if we have abstract class and abstract method: we can not create object of abstract class 
// but we have created a inner class so that Bird() object is actually the inner class object