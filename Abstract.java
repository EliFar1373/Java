package com.learn;

abstract class Car{
//	we need to ahve abstract class for abstract method 
//	 abstract class can have both normal method and abstract method 
	
	public void playmusic() {
		System.out.println("play music");
	}
	
//	public void drive() {
//		
//	}
//	instead of defining method we can declare it , we can not craete object
//	 we can not craete onject of abstract calss
	
	 public abstract void drive();
	 public abstract void fly();
	
}

//  when we define a class extends abstract class , thsi class shuld defien all abstract method in abstarct class
//  if it doe snot define allmethod , ir will eb abstarct also
abstract class Wag extends Car{
	
	public void drive(){
		System.out.println("drivig");
	}
	
	
}

class Updatewag extends Wag{ //concerete class 
	
	public void fly() {
		System.out.println("fly");
	}
}



public class Abstract {
	public static void main(String []arg) {
//	 we can not craete onject of abstract calss	
//		Car obj=new Car();s
//		obj.playmusic();
		
//		but you can craete referebce of car 
		
		Car obj=new Updatewag();
		obj.drive();
		obj.playmusic();
		
				
		
	}

}

//  declare method using abstrcat method 
//  we need abstarct class
//  we can not craete object of abstract class

