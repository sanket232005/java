package com.employee;

    class Person {
    private String name;
    private MyDate dateOfBirth;
    
    public Person(String name, MyDate dateOfBirth){
    	this.name = name;
    	this.dateOfBirth = dateOfBirth;
    }
    public void setName(String name) {
    	this.name = name;
    }
    public void setDateOfBirth(MyDate dateOfBirth) {
    	this.dateOfBirth = dateOfBirth;
    }
    public String getName() {
    	return name;
    }
    public MyDate getDateOfBirth() {
    	return dateOfBirth;
    }
    
    public String toString() {
    	return "Name :"+ name + ", Date of Birth : "+ dateOfBirth;
    }
    
}
