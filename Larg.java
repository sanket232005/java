package com.LARGEST2;

public class Larg {

	public static void main(String[] args) {
		int a=10; 
		int b=40; 
		int c=20;
		int greatest;
	    
		if(a>=b && a>=c) {
			greatest=a;
		}
		else if(b>=a && b>=c) {
			greatest=b;
		}
		else {
			greatest=c;
		}
		
		System.out.print("Largest Number is : " +greatest);
	}

}
