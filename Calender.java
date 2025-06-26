package com.CALENDAR;

import java.util.Calendar;
import java.util.Scanner;
                       

class Date{ 
	private int day; 
	private int month; 
	private int year; 
	
	public void initDate( ) {
	   Calendar c = Calendar.getInstance(); 
	   day = c.get(Calendar.DATE); 
	   month = c.get(Calendar.MONTH) + 1; 
	   year = c.get(Calendar.YEAR); 
	}
	public void acceptRecord( ) {
		Scanner sc  = new Scanner(System.in); 
		System.out.print("Day : ");
		day = sc.nextInt(); 
		System.out.print("Month : ");
		month = sc.nextInt(); 
		System.out.print("Year : ");
		year = sc.nextInt(); 
	}
	 
	public void printRecord( ) {
		System.out.println("Day : "+this.day);
		System.out.println("Month : "+this.month);
		System.out.println("Year : "+this.year);
	}
}

public class Calender {

	public static void main(String[] args) {
		
		Date dt1 = new Date();    
		
		
		dt1.initDate(); 
		dt1.printRecord(); 
		//dt1.acceptRecord();
		//dt1.printRecord(); 
		// dt1.initDate(); 
		//dt1.printRecord();
	}

}
