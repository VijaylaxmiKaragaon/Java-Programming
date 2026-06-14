
package com.Numbers;

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
//		for(int i=1;i<=n;i++) {
//			if(i%2!=0) {
//				System.out.print(i+" ");
//			}else {
//				System.out.println(i);
//			}
//		}
		
		//OR
		
//		for(int i=1;i<=n;i++) {
//			if(i%2!=0) {
//				System.out.println(i+" "+(i+1));
//			}
//		}
		
		//OR
		
		for(int i=1;i<=n;i+=2) {
			System.out.println(i+" "+(i+1));
		}

	}

}
