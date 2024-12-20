package javaVasic3;

class Mobile{
	
	
	
	
//	static method it will same for all object
	static String name;
//	instance variable
	String brand;
	
	
	public static void show2() {
		System.out.println("hi here is static");
	}
	
	public void show() {
//		we can have non static variable inside non static method 
		System.out.println(name+":"+brand);
	}
}

public class StaticVariableMethosLeraning {
	public static void main(String []args) {
//	we neeed object for non static method	
		Mobile obj1=new Mobile();
		Mobile obj2=new Mobile();
		obj1.name="gh";
		obj2.name="kkkkkk";
		obj1.brand="kl";
		obj2.brand="po";
		
//		System.out.println(obj1.name);
		obj1.show();
		obj2.show();
	
//		we can call static method by uisng class
		Mobile.show2();
//		Mobile.show(); we can not call non staic method by class and we need object
		
		
		
		
		
	}

}
