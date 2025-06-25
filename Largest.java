package com.largest;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter First Number :");
		int a = sc.nextInt();
		
		
		System.out.print("Enter Second Number :");
		int b = sc.nextInt();
		
		System.out.print("Enter Third Number :");
		int c = sc.nextInt();
		
		int greatest;
		
		if(a>=b && a>=c) {
			greatest= a;
			
		} else if (b>=a && b>=c) {
			greatest= b;
		} else {
			greatest = c;
		}
		
		System.out.print("The Largest Number is :" + greatest);
		
		sc.close();
	}

}
