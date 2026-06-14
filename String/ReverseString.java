package com.String;

public class ReverseString {

	public static void main(String[] args) {
		String s = "Vijaylaxmi";
		String res = "";
//		for(int i=s.length()-1; i>= 0; i--) {
//			res += s.charAt(i);
//		}
//		System.out.println(res);
		
		//OR
		
		for(int i=0; i<s.length()-1; i++) {
			res = s.charAt(i) + res;
		}
		System.out.println(res);

	}

}
