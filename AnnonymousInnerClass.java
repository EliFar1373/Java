package com.learn;

class AA{
	
	private int name;
	public void show() {
		System.out.println("in AA show");
	}
}

//  we create a annonymous inner class 

public class AnnonymousInnerClass {
	public static void main(String []arg) {
		AA obj=new AA() {
//			create a annonymois inner class, there is no name for this class
			public void show() {
				System.out.println("in new show");
			}
		};
		
		obj.show();
		
		
		
	}
	

}
