package com.basic.second;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryFinally2 {
	public static void main(String []arg) throws NumberFormatException, IOException {
		int i=0;
//		you can not have these two parts in try section , because you will call bf in finally section
//		InputStreamReader is=new InputStreamReader(System.in);
//		secodn way
//		BufferedReader bf=null;
		
	
//		you can call all resources in try itselt and it will close automatically
		try(BufferedReader bf=new BufferedReader(new InputStreamReader(System.in))) {
			
//		    bf=new BufferedReader(new InputStreamReader(System.in));
			int nm=Integer.parseInt(bf.readLine());

		
		}
		
		
	
		finally {
//			it is also used for closing different resources
//			bf.close();
			
		}
		
	}

}
