package Java_Final_2023;

import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException {
        Course[] courses = new Course[2];
        courses[0] = new Course(01, "OOP");
        courses[1] = new Course(02, "WEB");

        // Thêm giáo viên và sinh viên cho khóa học OOP
        Lecturer lecturer1 = new Lecturer(01, "Lecturer 1");
        courses[0].addLecturer(lecturer1);

        Student student1 = new Student(01, "Student 1");
        student1.setMidTermScore(2.5f);
        student1.setFinalScore(12.0f);
        courses[0].addStudent(student1);

        // Thêm giáo viên và sinh viên cho khóa học WEB
        Lecturer lecturer2 = new Lecturer(02, "Lecturer 2");
        courses[1].addLecturer(lecturer2);
 
        Student student2 = new Student(02, "Student 2");
        student2.setMidTermScore(9.5f);
        student2.setFinalScore(13.0f);
        courses[1].addStudent(student2);

        writeToFile(courses);
        readFromFile("testout.txt");
    }
    
    // Thêm phương thức writeToFile vào class Main
    static void writeToFile(Course[] courses) {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter("testout.txt"));
            for (Course course : courses) {
                course.writeToFile(writer);
            }
            System.out.println("Success...");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Thêm phương thức readFromFile vào class Main
    static void readFromFile(String fname) {
        try {
            BufferedReader in = new BufferedReader(new FileReader(fname));
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
