package com.Numbers;

public class P24 { 
	//a neon number is an integer where the sum of the digits on its square equals to the original number
    public static int check_neon(int num) {
    	int res=num*num;
    	int sum=0;
    	while(res != 0) {
    		int rem=res%10;
    		sum=sum+rem;
    		res/=10;
    	}
    	return sum;
    }
    
public static void main(String[] args) {
   int num=9;
    	int sum=check_neon(num);
		if(sum==num) {
    		System.out.println("Neon");
    	} else {
    		System.out.println("not neon");
    	}
        
 
    
	
}

}
