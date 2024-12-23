package com.learn;

import java.util.Objects;

class Laptop{
	String model;
	int price;
//	@Override
//	public String toString() {
//		return "Laptop [model=" + model + ", price=" + price + "]";
//	}
	
	public String toString() {
//		return "Hi";
		return model+":"+price;
		
	}
	
//	public boolean equals(Laptop that) {
//		if(this.model.equals(that.model)&&this.price==that.price) {
//			return true;
//		}
//		else
//			return false;
//		
//	}
	
//	second way
	
	
	public boolean equals(Laptop that) {
		
			return this.model.equals(that.model)&&this.price==that.price;
	
	}

	@Override
	public int hashCode() {
		return Objects.hash(model, price);
	}
//  third way
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		return Objects.equals(model, other.model) && price == other.price;
	}
	
}
public class ObjectClassEqualstoString {
	public static void main(String []arg) {
		Laptop lp=new Laptop();
		lp.model="ipad";
		lp.price=20;
		
		System.out.println(lp);
		System.out.println(lp.toString());
		
		
		
		Laptop lp2=new Laptop();
		lp2.model="ipad";
		lp2.price=20;
		
//		boolean result=lp==lp2; it did ot work
		boolean result=lp.equals(lp2);
		System.out.println(result);
		
		
	}

}
