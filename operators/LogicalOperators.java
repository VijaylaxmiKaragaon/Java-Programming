package com.operators;

public class LogicalOperators {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 10;
		System.out.println(a==c && a<b && a>=c && a<=b); //true
		System.out.println(a==c && a<b && a>=c && a>=b); //false
		System.out.println(a!=c || a>b || a>c || a<=b); //true

	}

}
