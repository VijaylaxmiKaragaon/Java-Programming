package com.conditions;


public class First {

	public static void main(String[] args) {
		int marks = 90;
		if(marks >= 85) {
			System.out.println("distinction");
		} else if(marks >= 60) {
			System.out.println("first class");
		} else if(marks >= 45) {
			System.out.println("second class");
		} else if(marks >= 35) {
			System.out.println("just pass");
		} else {
			System.out.println("just fail");
		}

	}

}
