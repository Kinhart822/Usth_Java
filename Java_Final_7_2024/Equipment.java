package Java_Final_7_2024;

import java.io.*;
import java.util.ArrayList;

public class Equipment {
    private String name;
    private String categoryName;
    private double price;
    private ArrayList<Equipment> equipments;

    public Equipment(String name, String categoryName, double price) {
        this.name = name;
        this.categoryName = categoryName;
        this.price = price;
        this.equipments = new ArrayList<Equipment>();
    }
    
    public String getName() {
        return name;
    }
    public String getCategoryName() {
        return categoryName;
    }
    public double getPrice() {
        return price;
    }
    public void addEquipment(Equipment equipment) {
        equipments.add(equipment);
    }

    public void writeToFile() {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter("equipment.txt"));
            writer.println();
            for (Equipment equipment : equipments) {
                writer.println("\n  Employee full name: " + equipment.getName());
                writer.println("\n  Employee ID: " + equipment.getCategoryName());
                writer.println("\n  Extra Salary: " + equipment.getPrice());
            }
            System.out.println("Success...");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
