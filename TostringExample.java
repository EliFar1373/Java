package com.basic;

 class Run {
	String name="eli";
	int age=30;
	String job="researcher";
	
	

	
	@Override
	public String toString() {
		return "TostringExample [name=" + name + ", age=" + age + ", job=" + job + "]";
	}
	
}


public class TostringExample{
	public static void main(String [] arg) {
		Run info=new Run();
		System.out.println(info.name);
		System.out.println(info);
		
		
		
	}}
