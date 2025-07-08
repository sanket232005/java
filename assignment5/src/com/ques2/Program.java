package com.ques2;

public class Program {

	public static void main(String[] args) {
		String original = "DOG";
		String reversed = "";
//		System.out.println(original.length());
		for(int i=original.length()-1; i >= 0; i--) {
			reversed += original.charAt(i);//specific index access
		}
		
		System.out.println(" Reverse String : " + reversed);

	}

}