package com.basic.second;

class A extends Thread{
	
	public void run() {
	
	for(int i=0;i<10;i++) {
		System.out.println("hi");
	}}
	
}

class B extends Thread{
	public void run() {
	for(int i=0;i<10;i++) {
		System.out.println("hello");
	}}
	
}

public class Threadds {
	public static void main(String []arg) {
		
		A obj1=new A();
		B obj2=new B();
		obj1.start();
		obj2.start();
		
		
	}

}
