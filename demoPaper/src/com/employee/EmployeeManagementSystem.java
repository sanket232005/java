package com.employee;

import java.util.Scanner;

public class EmployeeManagementSystem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number of Employee : ");
		int num = sc.nextInt();
		Employee[] employees = new Employee[num];
		int counter=0;
		
		System.out.print("/n===== Employee Management System ====");
		System.out.println("Add Employee : ");
		System.out.println("Display all Employees : ");
		System.out.println("Search Employee Id : ");
		System.out.println("Display Employee Joined in Given Year :");
		System.out.println("Find Employee with Maximum Salary : ");
		System.out.println("Find Employee with Minimum Salary");
		System.out.println("Exit the Application . ");
		System.out.println("Enter Choice : ");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1 : 
			if(counter<=num) {
				System.out.println("Enter Name :");
				String name = sc.nextLine();
				System.out.println("Enter Date Of Birth :");
				MyDate dob = new MyDate(sc.nextInt(), sc.nextInt(), sc.nextInt());
				System.out.println("Enter Id :");
				int id = sc.nextInt();
				System.out.println("Enter Department : ");
				String department = sc.nextLine();
				System.out.println("Enter Salary : ");
				double salary = sc.nextDouble();
				System.out.println("Enter Date Of Joining :");
				MyDate doj = new MyDate(sc.nextInt(), sc.nextInt(), sc.nextInt());
				employees[counter++] = new Employee(name,dob,id,department,salary,doj);
				System.out.println("Employee Added Succesfully . ");
			}
		}

	}

}
