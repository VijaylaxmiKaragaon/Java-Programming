package com.patterns;

public class Prgm44 {

	public static void main(String[] args) {
		int rows = 5;
		for(int i=1;i<=rows;i++) {
			int k= i;
			for(int j=1;j<=i;j++) {
				System.out.print(k%2+" ");
				k--;
			}
			System.out.println();
			
		}

	}

}

//output
//
//1 
//0 1 
//1 0 1 
//0 1 0 1 
//1 0 1 0 1 
