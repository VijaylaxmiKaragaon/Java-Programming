package com.Numbers;

public class P29 {
    public static int palindrome(int num) {
    	int res=0;
    	while(num != 0) {
    		int rem = num%10;
    		res=res*10+rem;
    		num/=10;
    	}
    	return res;
    }
	public static void main(String[] args) {
		for(int k=0;k<=10000;k++) {
			int num=k;
			int res=palindrome(num);
			if(num==res) {
				System.out.println(num);
			}
		}

	}

}
