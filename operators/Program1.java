package com.operators;

public class Program1 {

	public static void main(String[] args) {
		int a = 18;
		int b = 7;
		int c = 45;
//		if(a>b && a>c) {
//			System.out.println(a);
//		} else if(b>a && b>c) {
//			System.out.println(b);
//		} else {
//			System.out.println(c);
//		}
		
//		if(a>b) {
//			if(a>c) {
//				
//			}
//		}
		
//		int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
		
		//or
		
		int max = ((a>b) && (a>c))? a : ((b>a) && (b>c)) ? b : c;
		
		System.out.println(max);

	}

}
