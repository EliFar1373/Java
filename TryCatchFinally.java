package com.basic.second;

public class TryCatchFinally {
	public static void main(String []arg) {
		int i=0;
		
		try {
			
			int k=20/i;
//			System.out.println("bye");
			
		}
		catch(Exception e){
//			System.out.println("bye");
			
		}
//		if there is error the code after 20/i is not being printed, then catch will be printed
//		in case of finally, it will print everything there at end
		finally {
			System.out.println("bye");
			
		}
		
	}

}
