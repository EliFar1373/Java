package com.learn;

@FunctionalInterface
interface KJL{
	void show(int i);
}


public class LambdaExpressionLearn {
	public static void main(String []arg) {
//		KJL obj1=new KJL() {
//			public void show() {System.out.println("in show");}
//		}
//				;
//		
//				obj1.show();
				
				
//				KJL obj1=(int i)->System.out.println("in show"+i);
//				KJL obj1=(i)->System.out.println("in show"+i);
				KJL obj1=i->System.out.println("in show"+i);
				
						
				
				obj1.show(1);
				
	
	}	
}
