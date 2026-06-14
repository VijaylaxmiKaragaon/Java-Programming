package com.String;

public class TooSwapTheCases {

	public static String toSwapCase(String s) {
    	String res = "";
    	for(int i=0; i<s.length(); i++) {
    		char ch = s.charAt(i);
    		if(ch >= 97 && ch <= 122) {
    			int ascii = ch - 32;
    			char nch = (char)ascii;
    			res += nch;
    		} else {
    			int ascii1 = ch + 32;
    			char nch1 = (char)ascii1;
    			res += nch1;
    		}
    	}
    	return res;
    }
	public static void main(String[] args) {
		String s = "vijaYLaxmi";
		String res = toSwapCase(s);
		System.out.println(res);

	}

}
