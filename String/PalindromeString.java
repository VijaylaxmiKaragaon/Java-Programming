package com.String;

public class PalindromeString {

	public static void main(String[] args) {
		String s = "malayalam";
		String res = "";
		for(int i=s.length()-1; i>=0 ; i--) {
			res += s.charAt(i);
		}
		if(s.equals(res)) {
			System.out.println("Palindrome String");
		} else {
			System.out.println("Not Palindrome String");
		}

	}

}
