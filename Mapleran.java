package com.learn.test;

import java.util.HashMap;
import java.util.Map;

public class Mapleran {
	public static void main(String []arg) {
		Map<String,Integer> students=new HashMap<>();
		students.put("Eli", 1);
		students.put("hjk", 3);
		students.put("lk", 4);
		
		System.out.println(students);
		System.out.println(students.keySet());
		System.out.println(students.get("Eli"));
		
		for(String name:students.keySet())
			System.out.println(name+":"+students.get(name));
			
		
	}

}
