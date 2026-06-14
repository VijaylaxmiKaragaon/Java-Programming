package com.Numbers;

public class P27 {
        public static int happy_number(int num) {
        	int sum=0;
        	while(num != 0) {
        		int rem=num%10;
        		sum=sum+(rem*rem);
        		num/=10;
        	}
        	return sum;
        }
	public static void main(String[] args) {
		int num=7;
		while(num != 1 && num != 4) {
			 num=happy_number(num);
		}
        if(num==1) {
        	System.out.println("Happy number");
        } else {
        	System.out.println("not happy number");
        }
	}

}
