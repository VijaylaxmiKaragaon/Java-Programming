package com.Numbers;

public class P13 {
    public static int get_hcf(int a,int b) {
    	for(int i=Math.min(a, b);i>=1;i--) {
    		if(i%a==0 && i%b==0) {
    			return i;
    		}
    	}
    	return 1;
    }
	public static void main(String[] args) {
		int a = 12;
		int b = 8;
		int hcf = get_hcf(a,b);
		System.out.println((a*b)/hcf);

	}

}
