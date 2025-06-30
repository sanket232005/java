package com.assignment;

class Details{
	private int day;
	private int month;
	private int year;
	public Details(int day, int month, int year) { 
	  	this.day = day;
	  	this.month = month;
	  	this.year = year;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public void setYear(int year) {
		this.year = year; 
	}
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	public void displayDate() {
		System.out.printf("%d/%d/%d\n", day, month, year);
	}
}

class TestDate{
	Details dt = new Details(2, 8, 25);
	public void acceptRecord() {
		System.out.print("Initial Date: ");
		dt.displayDate();
		dt.setDay(8);
		dt.setMonth(9);
		dt.setYear(2025);
		
		
		System.out.print("Updated Datee: ");
		dt.displayDate();
		
		 System.out.println("Day: " + dt.getDay());
		 System.out.println("Month: " + dt.getMonth());
	     System.out.println("Year: " + dt.getYear());
	}
}


public class Date {

	public static void main (String [] args) {
		 TestDate dataset = new TestDate();
		 dataset.acceptRecord();
		 dataset.dt.setDay(10);
		 System.out.println("Updated Day is :"+ dataset.dt.getDay()) ;
		 System.out.printf("%d/%d/%d",dataset.dt.getDay(), dataset.dt.getMonth(), dataset.dt.getYear());
	}
	}