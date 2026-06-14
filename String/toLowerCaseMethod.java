package com.String;

public class toLowerCaseMethod {
    public static String toLowercase(String s) {
    	String res = "";
    	for(int i=0; i<s.length(); i++) {
    		char ch = s.charAt(i);
    		if(ch >= 65 && ch <= 90) {
    			int ascii = ch + 32;
    			char nch = (char)ascii;
    			res += nch;
    		} else {
    			res += ch;
    		}
    	}
    	return res;
    }
	public static void main(String[] args) {
		String s = "VIJAYLAxmi";
		String lwc = toLowercase(s);
		System.out.println(lwc);
		

	}

}
