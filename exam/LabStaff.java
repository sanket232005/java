package com.exam;

public class LabStaff extends Staff {
    private double salary;

    public LabStaff(int id, String name, double salary) throws StaffException {
        super(id, name);
        if (salary <= 0) throw new StaffException("Salary must be > 0");
        this.salary = salary;
    }

    public double getSalary() {
    	return salary;
    	}

    
    public String toString() {
        return " ID: " + id + ", Name: " + name + ", Salary: " + salary;
    }
}
