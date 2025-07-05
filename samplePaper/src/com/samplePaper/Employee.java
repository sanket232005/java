package com.samplePaper;

public class Employee extends Person {
    private int id;
    private String department;
    private double salary;
    private MyDate dateOfJoining;

    public Employee(String name, MyDate dateOfBirth, int id, String department, double salary, MyDate dateOfJoining) {
        super(name, dateOfBirth);
        this.id = id;
        this.department = department;
        this.salary = salary;
        this.dateOfJoining = dateOfJoining;
    }

    public int getId() { return id; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
    public MyDate getDateOfJoining() { return dateOfJoining; }

    @Override
    public String toString() {
        return super.toString() +
               ", ID: " + id +
               ", Department: " + department +
               ", Salary: " + salary +
               ", Date of Joining: " + dateOfJoining;
    }
}
