package javaVasic3;


class Mobile2{
	

	static String name;
	String brand;
	
	static {
		name="iphone";
		System.out.println("Static block executed for Mobile2!");
	}
	public Mobile2() {
		brand="df";
		System.out.println("in constructor");
		
	}
}



public class LoadClassManully{
	public static void main(String []args) throws ClassNotFoundException {
		

	
	Class.forName("javaVasic3.Mobile2");	
		
	}

}
