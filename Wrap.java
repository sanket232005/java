package com.WRAPPING;

import java.util.Scanner;

public class Wrap {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter Numbere :");
	int number = sc.nextInt();
	
	System.out.println("Given Number : "+number);
	
	System.out.println("Binary equivalent : "+Integer.toBinaryString(number));
	System.out.println("Octal equivalent : "+Integer.toOctalString(number));
	System.out.println("Hexadeciamal equivalent : "+Integer.toHexString(number));
	
	}

}
