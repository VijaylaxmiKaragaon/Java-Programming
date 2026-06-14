package com.patterns;

public class Prgm9 {

	public static void main(String[] args) {
		int rows = 5;
		for(int i=1;i<=rows;i++) {
			for(int j=rows;j>=i;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}

//output
//5 4 3 2 1 
//5 4 3 2 
//5 4 3 
//5 4 
//5 
