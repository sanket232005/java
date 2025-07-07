package com.exam;

public class TeachingStaff extends Staff {
    private double noOfHours;
    private double chargesPerHour;

    public TeachingStaff(int id, String name, double noOfHours, double chargesPerHour) throws StaffException {
        super(id, name);
        if (noOfHours <= 0) throw new StaffException("No. of hours must be > 0");
        if (chargesPerHour <= 0) throw new StaffException("Charges per hour must be > 0");

        this.noOfHours = noOfHours;
        this.chargesPerHour = chargesPerHour;
    }

    public double getNoOfHours() {
    	return noOfHours;
    	}

   
    public String toString() {
        return "Teaching Staff - ID: " + id + ", Name: " + name +
               ", Hours: " + noOfHours + ", Charges/Hour: " + chargesPerHour;
    }
}
