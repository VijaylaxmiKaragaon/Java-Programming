package com.Numbers;

public class P25 {
       public static int factorial(int num) {
    	   int sum=1;
    	   for(int i=1;i<=num;i++) {
    		   sum*=i;
    	   }
    	   return sum;
       }
	public static void main(String[] args) {
		int num=5;
		int res=factorial(num);
        System.out.println(res);
	}

}
