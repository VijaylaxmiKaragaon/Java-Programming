package com.operators;

public class AssignmentOperator {

	public static void main(String[] args) {
		int a = 10;
		a = a+5;
		System.out.println(a); //15
		a = a+5;
		System.out.println(a); //20
		a += 5;
		System.out.println(a); //25
		a -= 10;
		System.out.println(a); //15
		a *= 10;
		System.out.println(a); //150
		a /= 10;
		System.out.println(a); //15
		a %= 11;
		System.out.println(a); //4

	}

}
