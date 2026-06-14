package com.Numbers;

public class P15 {
    public static int sum_perfect(int num) {
    	int sum =0;
    	for(int i=1;i<num;i++) {
    		if(num%i==0) {
    			sum+=i;
    		}
    	}
    	return sum;
    }
	public static void main(String[] args) {
		 for(int k=1;k<=10000;k++) {
			 int num=k;
			 int res=sum_perfect(num);
			 if(num==res) {
				 System.out.println(num);
			 }
		 }

	}

}
