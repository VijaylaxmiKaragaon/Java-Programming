package com.Numbers;

public class P28 {
	
   public static int digit(int num) {
	   int sum=0;
	   while(num != 0) {
		   int rem=num%10;
		   sum=sum+rem;
		   num/=10;
	   }
	   return sum;
   }
   public static void main(String[] args) {
	int num =14;
	   int res = num + 1;
       while(digit(num)*2 != digit(res)) {
		   res++;
	   }

	   System.out.println(res);
}
}
