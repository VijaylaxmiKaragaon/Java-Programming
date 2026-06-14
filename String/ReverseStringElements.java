package com.String;

import java.util.Arrays;

public class ReverseStringElements {
    public static String reverse(String s) {
    	String res = "";
    	for(int i=0; i<s.length();i++) {
    		res = s.charAt(i) + res;
    	}
    	return res;
    }
	public static void main(String[] args) {
		String s = "Dhee coding lab";
		String[] arr = s.split(" ");
		System.out.println(Arrays.toString(arr));
		String res="";
		for(String word : arr) {
		    res += reverse(word)+" ";
		}
		System.out.println(res);

	}

}

//output
//[Dhee, coding, lab]
//eehD gnidoc bal 