package com.learn;

@FunctionalInterface
interface LLL{
	void show();
}



public class FunctionalInterfaceleran2 {
	public static void main(String []arg) {
		
		
		LLL obj1=new LLL() {
			
		
			public void show() {
				System.out.println("in show");
			}
			
			};
			obj1.show();
			
			
		
		
		
	}

}
