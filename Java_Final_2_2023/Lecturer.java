package Java_Final_2_2023;

import java.io.*;

public class Lecturer extends Person {
    public Lecturer(int id, String name){
        super();
        setId(id);
        setName(name);
    }

    // Thêm phương thức writeToFile vào class Lecturer
    public void writeToFile(PrintWriter writer) {
        super.writeToFile(writer);
    }

    // Thêm phương thức readFromFile vào class Lecturer
    public void readFromFile(BufferedReader in) throws IOException {
        super.readFromFile(in);
    }
}
