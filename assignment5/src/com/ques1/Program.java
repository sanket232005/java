package com.ques1;

public class Program {

	public static void main(String[] args) {
		String[] arr1 = {"apple" , "mango", "banana", "kiwi","chiku"};
		String[] arr2 = {"banana", "apple","lichi","grapes","chiku"};
		
		System.out.println("Duplicates in array are :");
		for(int i=0; i<arr1.length;i++) {
			for(int j=0; j<arr2.length;j++) {
				if(arr1[i].equals(arr2[j])) {
					System.out.println(arr1[i]);
					break;
				}
			}
		}
	}

}