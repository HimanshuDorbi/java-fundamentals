
// Define karo Employee class
public class Employee {
// Instance variables
private int id; // Employee ID
private String name; // Employee name
private int salary; // Employee salary
private static String companyName; // Name of the company
// Constructor
public Employee(int id, String name, int salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
}

// Getter method for Employee ID
public int getId() {
    return id;
}

// Setter method for Employee ID
public void setId(int id) {
    this.id = id;
}

// Getter method for Employee name
public String getName() {
    return name;
}

// Setter method for Employee name
public void setName(String name) {
    this.name = name;
}

// Getter method for Employee salary
public int getSalary() {
    return salary;
}

// Setter method for Employee salary
public void setSalary(int salary) {
    this.salary = salary;
} 

// Getter method for company name
public static String getCompanyName() {
    return companyName;
} 

// Setter method for company name
public static void setCompanyName(String companyName) {
    Employee.companyName = companyName;
}

// Method to display employee details
public void display() {
    System.out.println("ID = " + id);
    System.out.println("NAME = " + name);
    System.out.println("SALARY = " + salary);
    System.out.println("COMPANY NAME = " + companyName);
}

// Main method
public static void main(String[] args) {
    // Set company name using the static setCompanyName method
    Employee.setCompanyName("Microsoft");

    // Create an Employee object and call the display method to show employee details
    Employee emp1 = new Employee(23, "Nikhil Mahar", 100000);
    emp1.display();
}
}
