package com.Numbers;

public class P11 {
    
	public static void main(String[] args) {
		int hcf = 1;
		int a = 12;
		int b = 8;
		for(int i=1;i<=Math.min(a, b);i++) {
			if(a%i==0  && b%i==0) {
				hcf = i;
			}
		}
		System.out.println(hcf);
	}

}
