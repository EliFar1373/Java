package com.learn;



class D{
	
	int age;
	
	public void show() {
		System.out.println("In show");
		
	}
	
//	static can be used for inner class only
	
	static class G{
		
		public void config() {
			System.out.println("In config class B");
		}
	}
	
	
}

public class StaticInnerClass {
	public static void main(String []arg) {
		
		
		D obj=new D();
		obj.show();
		
		
//		use inner class staic B, we do not to craete obj of class D
		D.G obj2=new D.G();
		
		obj2.config();
		
		
		
	}
	
}











