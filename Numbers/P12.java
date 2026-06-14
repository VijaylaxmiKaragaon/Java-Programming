package com.Numbers;

public class P12 {

	public static void main(String[] args) {
		int a = 12;
		int b = 8;
		for(int i=Math.max(a, b);i<=(a*b);i++) {
			if(i%a==0 && i%b==0) {
				System.out.println(i);
				break;
			}
		}

	}

}
