package com.Numbers;

public class P21 {
	public static int count_digit(int num) {
    	int digit=0;
    	while(num != 0) {
    		num/=10;
    		digit++;
    	}
    	return digit;
    }
    
    public static int get_disarium(int num,int digit) {
    	int res=0;
    	while(num != 0) {
    		int rem=num%10;
    		res=res+(int)Math.pow(rem, digit);
    		num=num/10;
    		digit--;
    	}
    	return res;
    }
public static void main(String[] args) {
	int num=135;
	int digit=count_digit(num);
	int res=get_disarium(num,digit);
    if(num==res) {
    	System.out.println("Disarium");
    } else {
    	System.out.println("Not Disarium");
    }
}

}
