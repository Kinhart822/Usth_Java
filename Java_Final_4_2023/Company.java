package Java_Final_4_2023;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Company {
    public static void main(String[] args) {
        Employee employees = new Employee("Company", null, null, 0, 0);

        Employee student1 = new Employee("01", "Anh1", "B2", 100, 50);
        employees.addEmployee(student1);

        Employee student2 = new Employee("02", "Anh2", "B4", 200, 100);
        employees.addEmployee(student2);

        // Ghi thông tin khóa học ra file
        employees.writeToFile();

        // Đọc thông tin từ file
        readFromFile(employees);
    }

    public static void readFromFile(Employee employee) {
        try {
            BufferedReader in = new BufferedReader(new FileReader("employees.txt"));
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
