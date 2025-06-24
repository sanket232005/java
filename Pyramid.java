package com.pyramid;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n=7;
       int starCount=1;
       for(int i=1;i<=n;i++) {
    	   
    	   for(int j=1;j<=(n-i);j++) {
    		   
    		   System.out.print("  ");
    	   }
    		   for(int k=1;k<=starCount;k++) {
    			   
    			System.out.print("* ");   
    	   }		   
    		   
    	   System.out.println();
    	   
    	    starCount = starCount + 2;
       }
	}

}
