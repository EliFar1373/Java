package com.javabasic;

class Human{
	String name;
	static int age;
	private String color;
	
// default constructor	
	public Human() {
		name="eli";
		color="red";
		System.out.println("in constructor");		
	}
	
//	parameterized constructor
	public Human(String cl) {
		color=cl;
	}
	
//	getter and setter
	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	static {
		age=30;
		System.out.println("in static");
	}
	
	
	
	
}

public class Constructor {
	public static void main(String []args) {
		System.out.println(Human.age);
		
		Human hm=new Human();
//		parameterized constructor
		Human hm2=new Human("yellow");
//		hm.setColor("black");
		String nm=hm.name;
		

		System.out.println(hm2.getColor());
		System.out.println(nm);
		System.out.println(hm.getColor() );
		
	}

}
