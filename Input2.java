package com.basic.second;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input2 {
	public static void main(String []arg) throws NumberFormatException, IOException {
		System.out.println("give nm");
		
		InputStreamReader st=new InputStreamReader(System.in);
		BufferedReader bf=new BufferedReader(st);
		
		int nm=Integer.parseInt(bf.readLine());
		
		System.out.println("see nm:"+nm);
		
	}

}
