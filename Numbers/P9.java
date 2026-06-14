package com.Numbers;

public class P9 {
    public static int count_fact(int num) {
    	int count = 0;
    	for(int i=1; i<= num;i++) {
    		if(num%i==0) {
    			count++;
    		}
    	}
    	return count;
    }
	public static void main(String[] args) {
		int count_prime = 0;
		for(int k=1; ; k++) {
			int num = k;
			int fact=count_fact(num);
			if(fact==2) {
				System.out.println(num);
				count_prime++;
				if(count_prime == 50) {
					break;
				}
			}
		}

	}

}
