package com.patterns;

public class Prgm46 {

	public static void main(String[] args) {
		int rows = 5;
		for(int i=1;i<=rows;i++) {
			int k= rows+1-i;
			for(int j=1;j<=i;j++) {
				System.out.print((k+1)%2+" ");
				k++;
			}
			System.out.println();
			
		}

	}

}
//output
//0 
//1 0 
//0 1 0 
//1 0 1 0 
//0 1 0 1 0 