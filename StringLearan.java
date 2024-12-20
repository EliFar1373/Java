package javaVasic3;

public class StringLearan {
	public static void main(String []args) {
		
		String name="eli";
		String name2=new String("elli");
		System.out.println(name2.charAt(0));
		System.out.println(name2);
		System.out.println(name2.concat(" fd"));
		
		name=name+" df";
		System.out.println(name);
		
//		mutable string
		String s1="dff";
		String s2="dff";
		System.out.println(s1==s2);
		
		
		
		
//		buffer string
		StringBuffer sf=new StringBuffer("eli");
		System.out.println(sf.capacity());
		
//		append
		System.out.println(sf);
		System.out.println(sf.append(" hi"));
		
//	turn to string	
		String dp=sf.toString();
		
//		delete a charecter 
		System.out.println(sf.deleteCharAt(1));
		System.out.println(sf.insert(1, "java"));
		System.out.println();
	
		
		
		
		
	}

}
