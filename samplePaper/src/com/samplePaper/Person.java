package com.samplePaper;

public class Person {
    private String name;
    private MyDate dateOfBirth;

    public Person(String name, MyDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() { return name; }
    public MyDate getDateOfBirth() { return dateOfBirth; }

    @Override
    public String toString() {
        return "Name: " + name + ", Date of Birth: " + dateOfBirth;
    }
}
