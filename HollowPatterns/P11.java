package com.HollowPatterns;

public class P11 {

	public static void main(String[] args) {
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=6;j++) {
				if((i==1 && j%3==0) || (i==0 && j%3!=0) || (i-2==j) || (8-i==j)){
					System.out.print("*"+" ");
				}
				else if((i==2 && j==2)) {
					System.err.print(" "+"A");
				}
				else if((i==2 && j==3)) {
					System.err.print("P"+"P");
				}
				else if((i==2 && j==4)) {
					System.err.print("A"+" ");
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}

	}

}

//output
//
//  * *   * *   
//*     *     * 
//*   APPA    * 
//  *       *   
//   *    *     
//     *    