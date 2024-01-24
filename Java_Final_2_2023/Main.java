package Java_Final_2_2023;

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
        // Thêm giáo viên và sinh viên cho khóa học WEB
        Lecturer lecturer2 = new Lecturer(02, "Lecturer 2");
        courses[1].addLecturer(lecturer2);

        Student student1 = new Student(01, "Student 1", 2); // 2 là số lượng khóa học
        student1.setMidTermScore(0, 8.5f); // Điểm giữa kỳ cho khóa học thứ nhất
        student1.setMidTermScore(1, 7.0f); // Điểm giữa kỳ cho khóa học thứ hai
        student1.setFinalScore(0, 12.0f); // Điểm cuối kỳ cho khóa học thứ nhất
        student1.setFinalScore(1, 10.0f); // Điểm cuối kỳ cho khóa học thứ hai
        courses[0].addStudent(student1);
        courses[1].addStudent(student1);

        Student student2 = new Student(02, "Student 2", 2); // 2 là số lượng khóa học
        student2.setMidTermScore(0, 8.5f); // Điểm giữa kỳ cho khóa học thứ nhất
        student2.setMidTermScore(1, 7.0f); // Điểm giữa kỳ cho khóa học thứ hai
        student2.setFinalScore(0, 12.0f); // Điểm cuối kỳ cho khóa học thứ nhất
        student2.setFinalScore(1, 10.0f); // Điểm cuối kỳ cho khóa học thứ hai
        courses[0].addStudent(student2);
        courses[1].addStudent(student2);

        writeToFile(courses);
        readFromFile("testout.txt");
    }
    
    // Thêm phương thức writeToFile vào class Main
    static void writeToFile(Course[] courses) {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter("testout1.txt"));
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
