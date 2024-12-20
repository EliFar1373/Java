package com.javabasic;

class Calc{
	
	public int add(int n1,int n2) {
		return n1+n2;
		
	}
	public int sub(int n3,int n4) {
		return n3-n4;
		
	}
}

class AdvCalc extends Calc{
	
	public int multi(int n5,int n6) {
		return n5*n6;
	}
	public int div(int n7,int n8) {
		return n7/n8;
	}
}



public class Inheritancelearn {
	public static void main(String []args) {
		
		Calc cal=new Calc();
		int r1=cal.add(2, 3);
		int r2=cal.sub(4, 2);
		System.out.println(r1+"sub"+r2);
		
		System.out.println("Advace calc");
		AdvCalc adcal=new AdvCalc();
		int r3=adcal.div(4, 2);
		System.out.println("div:"+r3);
		int r4=adcal.add(4, 2);
		System.out.println("add:"+r4);
		
		
	}

}
