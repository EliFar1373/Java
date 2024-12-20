package javaVasic3;



class Cal1{
	

	
	private int age;
    private String name;
    
	public String getName() {
		return name;
		
	}
//	here age inside prantice is local and another age as instance 
//	public void setAge(int age, Cal1 obj ) {
//		Cal1 obj1=obj;
//		obj1.age=age;
//	}
//	instead of craeting obj we can use this to refere that name as instance
	public void setAge(int age) {
		
		this.age=age;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	
	
	public int getAge() {
		return age;
		
	}
}




public class ThisLearn {
	public static void main(String []args) {
		Cal1 cll=new Cal1();
		cll.setName("eli");
//		cll.setAge(30,cll);
		cll.setAge(30);
		System.out.println("name:"+cll.getName()+",age:"+cll.getAge());
	}

}


//  this is to differentiate local variable from instance




