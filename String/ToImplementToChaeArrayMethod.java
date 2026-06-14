package com.String;

import java.util.Arrays;

public class ToImplementToChaeArrayMethod {
    public static char[] tocharArray1(String s) {
    	char[] arr = new char[s.length()];
    	for(int i=0; i<s.length(); i++) {
    		arr[i] = s.charAt(i);
    	}
    	return arr;
    }
	public static void main(String[] args) {
		String s = "dhee coding lab";
         char[] res = tocharArray1(s);
         System.out.println(Arrays.toString(res));
	}

}
