package com.operators;

public class UnaryOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        int a = 10;
//        System.out.println(a++); //10
//        System.out.println(--a); //10
//        System.out.println(a--); //10
//        System.out.println(++a); //10
        
        int a=14;
        System.out.println(++a + a++);
        System.out.println(a-- + --a);
        System.out.println(--a + a++);
	}

}
