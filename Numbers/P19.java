package com.Numbers;

public class P19 {
        public static int count_digit(int num) {
        	int digit=0;
        	while(num != 0) {
        		num/=10;
        		digit++;
        	}
        	return digit;
        }
	public static void main(String[] args) {
		int num=1234;
		int res=count_digit(num);
		System.out.println(res);

	}

}
