package com.Numbers;

public class P14 {
    public static int sum_fact(int num) {
    	int sum=0;
    	for(int i=1;i<num;i++) {
    		if(num%i==0) {
    			sum+=i;
    		}
    	}
		return sum;
    }
	public static void main(String[] args) {
		int num=6;
		int res=sum_fact(num);
		if(num==res) {
			System.out.println("perfect");
		} else {
			System.out.println("not perfect");
		}

	}

}
