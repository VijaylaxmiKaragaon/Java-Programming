package com.Numbers;

public class P31 {
	public static int palindrome(int i) {
		int res=0;
		while(i !=0) {
			int rem=i%10;
			res=res*10+rem;
			i/=10;
		}
		return res;
	}
	public static int beautifulNumber(int i,int k,int j) {
		int count=0;
		for(int num=i;num<=j;num++) {
			int rev = palindrome(num);
            int diff = Math.abs(num - rev);

            if (diff % k == 0) {
                count++;
            }
		}
		return count;
	}
	public static void main(String[] args) {
		int i=20;
		int j=23;
		int k=6;
		int rev=palindrome(i);
		int res=beautifulNumber(i,k,j);
		System.out.println(res);
	}

}
