package com.employee;

public class MyDate {
    private int day;
    private int month;
    private int year;
    
    public  MyDate(int day, int month, int year) {
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
       public int getDAy() {
    	   return day;
       }
       public int getMonth() {
    	   return month;
       }
       public int getYear() {
    	   return year;
       }
       public String  toString() {
    	   return String.format("Date : %d-%d-%d",day,month,year );
       }
    }

