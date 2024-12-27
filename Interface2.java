package com.learn;


abstract  class Computer{
	public abstract void code();
		
	
	
}



//  instead of abstract we can use implemnetsand interface 
//interface Computer{
//	void code();
//	
//}

//class Laptopp implements  Computer{
//	
//	public void code() {
//		System.out.println("coding laptop");
//	}
//	
//}

class Laptopp extends Computer{
	
	public void code() {
		System.out.println("coding laptop");
	}
	
}


class Desktop extends Computer{
	public void code() {
		System.out.println("coding desktop");
	}
	
}


class Developer{
	
	public void devApp(Computer com ) {
		
		com.code();
		
	}
	
}


public class Interface2 {
	public static void main(String []arg) {
		
	
		Computer desk=new Desktop();
		Computer lapp=new Laptopp();
		Developer dev=new Developer();
		
		dev.devApp(lapp);
		
		
		
		
		
	}

}
