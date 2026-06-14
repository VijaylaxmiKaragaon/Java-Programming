package com.HollowPatterns;

public class P12 {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=7;j++) {
				if(i==j || 8-i==j) {
					System.out.print("*"+" ");
				} else {
					System.out.print(" "+" ");
				}
				
			}
			System.out.print("  ");
		         for(int j=1;j<=7;j++) {
					if(i==1 || j==4 || i==4) {
						System.out.print("*"+" ");
					} else {
						System.out.print(" "+" ");
					}
				}
		         System.out.print("  ");
		         for(int j=1;j<=7;j++) {
						if(i==1 || j==4 || i==4 && j<=3) {
							System.out.print("*"+" ");
						} else {
							System.out.print(" "+" ");
						}
					}
//		         System.out.print("  ");
		         for(int j=1;j<=7;j++) {
						if((i==1 && j==4) || (i==2 && j==3) || (i==2  && j==5) || (i==3 &&(j>1 && j<=6)) || 
								(i==4 && j==1) ||(i==4 && j==7)) {
							System.out.print("*"+" ");
						} else {
							System.out.print(" "+" ");
						}
					}
		         for(int j=1;j<=7;j++) {
						if(i==1 || j==4 || i==4 && j<=3) {
							System.out.print("*"+" ");
						} else {
							System.out.print(" "+" ");
						}
					}

			System.out.println();
		}

	}

}
