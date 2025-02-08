package com.basic;


class Human{
	
	private int age;
	private String name;
	
//	we build a constructor 1- has same name as class
//	2- it deos not need to retrurn anything no void int 
//	3- inside it can be anything
//	it would be run after creating each object
	
	public Human() {
		System.out.println("constructor");
		age=20;
		name="Eli";
	
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
public class ConstructorExample {
	public static void main(String [] args) {
		
		Human obj1=new Human();
		Human obj2=new Human();
		System.out.println("result is "+obj1.getAge()+":"+obj1.getName());
		
		
		
	}
	
	
}
