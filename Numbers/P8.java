package com.Numbers;

public class P8 {

	public static int print_fact(int num) {
		int count = 0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		for(int k=1; k<=10000 ;k++) {
			int num = k;
			int fact = print_fact(num);
			if(fact==2) {
				System.out.println(num);
			}	
		}
		 
	}

}
