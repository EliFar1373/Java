package javaVasic3;


//we can use static block to give value to static variable
//	we initiate non static variable by constructor which is called by every tiem we call a object
//	or we can give value in in the main section
//	we load class and then instantiate obj


class Mobile1{
	
	
//	static method it will same for all object
	static String name;
//	instance variable
	String brand;
	
	
	
//	static block
	static {
		name="smartphone";
		System.out.println("in static block");
		
	}
	
//	constructor for non static variable	
	public Mobile1() {
		 brand="iphone";
		 System.out.println("in constructor");
		
	}


	
	
	
	public void show() {

		System.out.println(name+":"+brand);
	}
}



public class StaticblockAndConstructor {
	public static void main(String []args) {

		Mobile1 obj1=new Mobile1();
		Mobile1 obj2=new Mobile1();
		
		
//		second way to initiate the non static variable
//		obj1.name="gh";
		obj1.brand="kl";
		obj1.show();
		
		obj2.show();
		
		
	
		
		
		
		
		
		
	}

}
