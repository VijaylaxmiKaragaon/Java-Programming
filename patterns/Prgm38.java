package com.patterns;

public class Prgm38 {

	public static void main(String[] args) {
		int rows=5;
		int k =1;
//		for(int i=1;i<=rows;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(k%5+" ");
//				k++;
//			}
//			System.out.println();
//		}
        
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(k+" ");
				k++;
				if(k==5) {
					k=0;
				}
			}
			System.out.println();
		}

	
	}

}

//output
//
//1 
//2 3 
//4 0 1 
//2 3 4 0 
//1 2 3 4 0 
