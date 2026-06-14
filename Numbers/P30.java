package com.Numbers;

public class P30 {
    public static int palindrome(int num) {
    	int res=0;
    	while(num !=0) {
    		int rem=num%10;
        	res=res*10+rem;
        	num/=10;
    	}
    return res;
    }
	public static void main(String[] args) {
		float sum=0; int count=0;
	for(int k=0; ;k++) {
		int num=k;
		int res=palindrome(num);
		if(num==res) {
			sum+=num;
			count++;
		}
		if(count==50) {
			System.out.println(sum/count);
			break;
		}
	}

	}

}

//output
//
//167.08