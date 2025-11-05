package org.java8;

import java.util.List;

public class Employee {

    private String name;
    private int age;
    private double salary;
    private String department;

    // Constructors
    public Employee(String name, int age, double salary, String department) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    // Getters and Setters for all fields
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    //no arg constructor
    public Employee() {
    }

    List<Employee> employees = List.of(
            new Employee("Alice", 30, 70000, "HR"),
            new Employee("Bob", 25, 60000, "IT"),
            new Employee("Charlie", 35, 80000, "Finance"),
            new Employee("David", 28, 65000, "IT"),
            new Employee("Eve", 32, 72000, "HR")
    );

    public List<Employee> getEmployees() {
        return employees;
    }
}