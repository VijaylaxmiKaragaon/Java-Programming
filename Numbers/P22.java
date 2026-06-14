package com.Numbers;

public class P22 {

	public static int count_digit(int num) {
    	int digit=0;
    	while(num != 0) {
    		num/=10;
    		digit++;
    	}
    	return digit;
    }
    
    public static int get_armstrong(int num,int digit) {
    	int res=0;
    	while(num != 0) {
    		int rem=num%10;
    		res=res+(int)Math.pow(rem, digit);
    		num=num/10;
    	}
    	return res;
    }
public static void main(String[] args) {
    for(int k=0;k<=10000;k++) {
    	int num=k;
    	int digit=count_digit(num);
    	int res=get_armstrong(num,digit);
        if(num==res) {
        	System.out.println(num);
        } 
    }
	
}

}
