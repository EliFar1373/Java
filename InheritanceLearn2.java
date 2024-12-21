package com.learn;

class Calc{
	
	public int add(int n1,int n2) {
		return n1+n2;
	}
}


class AdvCalc extends Calc{
	public int multi(int n3,int n4) {
		return n3*n4;
	}	
}

class VeyAdvCalc extends  AdvCalc{
	public double power(int n5,int n6) {
		return Math.pow(n5, n6);
	}
}


public class InheritanceLearn2 {
	public static void main(String []args) {
		
		
		 VeyAdvCalc calc=new  VeyAdvCalc();
		 System.out.println(calc.add(1, 2));
		 
		 System.out.println(calc.power(1, 2));
		 System.out.println(calc.multi(1, 2));
		 
		
	}

}

//  in java we can not have two inheritance, extends A, B 

