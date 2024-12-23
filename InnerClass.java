package com.learn;



class C{
	
	int age;
	public void show() {
		System.out.println("In show");
		
	}
	
	class B{
		
		public void config() {
			System.out.println("In config class B");
		}
	}
	
	
}





public class InnerClass {
	public static void main(String []arg) {
		C obj=new C();
		obj.show();
		
		
//		use inner class B:
		C.B obj2=obj.new B();
		obj2.config();
		
	}

}
