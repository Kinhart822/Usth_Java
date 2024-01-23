package Java_Final_Ex2_2_2023;

import java.io.*;

public class Person {
    private String name;
    private int id;

    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }

    // Thêm phương thức writeToFile vào class Person
    public void writeToFile(PrintWriter writer) {
        writer.println("ID: " + getId() + ", Name: " + getName());
    }

    // Thêm phương thức readFromFile vào class Person
    public void readFromFile(BufferedReader in) throws IOException {
        String line = in.readLine();
        System.out.println(line);
    }
}
