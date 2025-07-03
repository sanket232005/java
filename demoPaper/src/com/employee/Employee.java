package com.employee;

public class Employee extends Person{
   private int id;
   private String department;
   private double salary;
   private MyDate dateOfJoining;
  
   
   public Employee(int id, String department, double salary, MyDate dateOfJOining) {
	   super(name, dateOfBirth);
	   this.id= id;
	   this.department = department;
	   this.salary = salary;
	   this.dateOfJoining = dateOfJoining;   
	   
   }
   
   public void setId(int id) {
	   this.id = id;
   }
   public void setDepartment(String department) {
	   this.department = department;
   }
   public void setSalary(double salary) {
	   this.salary = salary;
   }
   public void setDateOfJoining(MyDate dateOfJOining) {
	   this.dateOfJoining = dateOfJoining;
   }
   public int getId() {
	   return id;
   }
   public String getDepartment() {
	   return department;
   }
   public double getSalary() {
	   return salary;
   }
   public MyDate getDateOfJoining() {
	   return dateOfJoining;
   }
   public String toString() {
	   return "ID : "+ id + super.toString()+", Department : "+ department +", Salary : "+ salary +", Date Of Joining : "+ dateOfJoining;
   }

}
