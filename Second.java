package com.dkte;

public class Second {

	public static void main(String[] args) {
		int a=0,b=1,c;
		for(int i=0;i<50;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
	}

}
