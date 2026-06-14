package com.Numbers;

public class P26 {
	    public static int factorial(int num) {
	    int res=1;
	    	for(int i=1;i<=num;i++) {
	    		res*=i;
	    	}
	    	return res;
	    }
        public static int get_krishnamurthy(int num) {
        	int res=0;
        	while(num != 0) {
        		int rem=num%10;
        		res=factorial(rem)+res;
        		num=num/10;
        	}
         return res;
        }
	public static void main(String[] args) {
		int num=145;
		int res=get_krishnamurthy(num);
         if(num==res) {
        	 System.out.println("krishnamurthy");
         } else {
        	 System.out.println("not krishnamurthy number");
         }
	}

}
