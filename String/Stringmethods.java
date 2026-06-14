package com.String;

import java.util.Arrays;

public class Stringmethods {

	public static void main(String[] args) {
		String s = "Dhee coDinG Lab";
		System.out.println(s.charAt(5));
		System.out.println(s.length());
		char [] arr = s.toCharArray();
		//It only prints the string value not in array format
		System.out.println(arr);
		//It prints the string in array format
		System.out.println(Arrays.toString(arr));
		String ls = s.toLowerCase();
		System.out.println(ls);
		String us = s.toUpperCase();
		System.out.println(us);
		System.out.println(s.substring(2));
		System.out.println(s.substring(2, 4));
		//It does not written anything 
		System.out.println(s.substring(2, 2));
		
		System.out.println(s.contains("co"));
		System.out.println(s.indexOf("ab"));
		System.out.println(s.lastIndexOf("e"));
		//It writtens the -1 bcz in string e in lowercase but 
		//in arguement we are providing it in uppercase 
		System.out.println(s.lastIndexOf("E"));
		
	}

}
