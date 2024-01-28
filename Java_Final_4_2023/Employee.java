package Java_Final_4_2023;

import java.io.*;
import java.util.ArrayList;

public class Employee {
    private String ID;
    private String name;
    private String department;
    private double basic_salary;
    private double extra_salary;
    private ArrayList<Employee> employees;

    public Employee(String ID, String name, String department, double basic_salary, double extra_salary) {
        this.ID = ID;
        this.name = name;
        this.department = department;
        this.basic_salary = basic_salary;
        this.extra_salary = extra_salary;
        this.employees = new ArrayList<Employee>();
      }
    
    public String getID() {
        return ID;
    }
    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }
    public double getBasic_salary() {
        return basic_salary;
    }
    public double getExtra_salary() {
        return extra_salary;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void writeToFile() {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter("employees.txt"));
            writer.println();
            for (Employee employee1 : employees) {
                writer.println("\n  Employee full name: " + employee1.getName());
                writer.println("\n  Employee ID: " + employee1.getID());
                writer.println("\n  Employee Department: " + employee1.getDepartment());
                writer.println("\n  Basic salary: " + employee1.getBasic_salary());
                writer.println("\n  Extra Salary: " + employee1.getExtra_salary());
                double income = employee1.getBasic_salary() + employee1.getExtra_salary() * 2.5;
                writer.println("\n  => Income: " + income);
            }
            System.out.println("Success...");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


