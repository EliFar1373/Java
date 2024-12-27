package com.learn;

// interface-interface : extends 
//  class-class: extends
// class -interface : implements

interface V{
	void get();
}
interface X{
	void doo();
}

// on interface can extends another one
interface G extends X{
	void Hi();
}

//  we can have one class implements multiple interfaces

class DoGet implements V,X{
	
	public void doo() {
		System.out.println("in doo");
	}
	
	public void get() {
		System.out.println("in get");
	}
	
}


public class Interface3 {
	public static void main(String []arg) {
		
		
	}

}
