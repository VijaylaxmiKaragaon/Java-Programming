package com.Numbers;

public class P6 {

	public static int print_fact(int num) {
		int count = 0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
//				System.out.println(i);
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int num = 12;
		int fact = print_fact(num);
		System.out.println(fact);

	}

}
