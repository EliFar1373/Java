package javaVasic3;


class Neww{
	
	int a=1;
	public int dog() {
		
		System.out.println("hiiiiii");
		return 0;
	}
		
	public String pen(int cost) {
		System.out.println(cost);
		return "pen";
		
		
	}
	
	public int book(int cost1,int cost2) {
		int result=cost1+cost2;
		return result;
		
		
		
	}
	
	public int cat(int cost1,int cost2) {
		
		return cost1+cost2;
		
		
		
	}
	
	
	

}







public class ClassLearn {
	public static void main(String []args) {
		
		Neww nw=new Neww();
		System.out.println(nw.a);
		System.out.println(nw.dog());
		String hj=nw.pen(100);
		System.out.println(hj);
		int costofbook=nw.book(2, 3);
		System.out.println("costofbook"+costofbook);
		
		
		
		int num1=2;
		int num2=3;
		int result=num1+num2;
		System.out.println("result is:"+result);
	}

}
