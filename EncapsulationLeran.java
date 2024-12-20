package javaVasic3;

class Cal{
	
//	when we have private instance, we can only use it in same class and for using out of class use getNmae
//	private String name="eli";
//	private int age=30;
//	so we encapsualte instance and we can have access to them using method
	
	private int age=30;
    private String name;
    
	public String getName() {
		return name;
		
	}
	public void setAge(int a ) {
		age=a;
	}
	public void setName(String n) {
		name=n;
	}
	
	
	
	public int getAge() {
		return age;
		
	}
}


public class EncapsulationLeran {
	public static void main(String []args) {
		Cal cl=new Cal();
		cl.setName("eli");
		cl.setAge(30);
		System.out.println("name:"+cl.getName()+",age:"+cl.getAge());
	}

}
