package com.patterns.DiamaondPatterns;

public class Prgm14 {
	public static void main(String[] args) {
	      int rows=5;
	      for(int i=1;i<=rows;i++) {
	    	  for(int j=1;j<=rows-i;j++) {
	    		  System.out.print(" "+" ");
	    	  }
	    	  for(int j=rows+1-i;j<=rows;j++) {
	    		  System.out.print((char)(j+64)+" ");
	    	  }
	    	  for(int j=rows-1;j>=rows+1-i;j--) {
	    		  System.out.print((char)(j+64)+" ");
	    	  }
	    	  System.out.println();
	      }
	      
	      for(int i=rows-1;i>=1;i--) {
	    	  for(int j=1;j<=rows-i;j++) {
	    		  System.out.print(" "+" ");
	    	  }
	    	  for(int j=rows+1-i;j<=rows;j++) {
	    		  System.out.print((char)(j+64)+" ");
	    	  }
	    	  for(int j=rows-1;j>=rows+1-i;j--) {
	    		  System.out.print((char)(j+64)+" ");
	    	  }
	    	  System.out.println();
	      }

		}

	}

//output
//
//        E 
//      D E D 
//    C D E D C 
//  B C D E D C B 
//A B C D E D C B A 
//  B C D E D C B 
//    C D E D C 
//      D E D 
//        E 