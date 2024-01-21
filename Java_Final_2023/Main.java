package Java_Final_2023;

import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException {
        Course[] courses = new Course[3];
        courses[0] = new Course(01, "OOP");
        courses[1] = new Course(02, "WEB");
        courses[2] = new Course(03, "IP");

        // Thêm giáo viên và sinh viên cho khóa học OOP
        courses[0].addLecturer(new Lecturer(01, "Lecturer 1"));
        courses[0].addLecturer(new Lecturer(02, "Lecturer 2"));
        courses[0].addStudent(new Student(01, "Student 1"));
        courses[0].addStudent(new Student(02, "Student 2"));

        // Thêm giáo viên và sinh viên cho khóa học WEB
        courses[1].addLecturer(new Lecturer(03, "Lecturer 3"));
        courses[1].addLecturer(new Lecturer(04, "Lecturer 4"));
        courses[1].addStudent(new Student(03, "Student 3"));
        courses[1].addStudent(new Student(04, "Student 4"));

        // Thêm giáo viên và sinh viên cho khóa học IP
        courses[2].addLecturer(new Lecturer(05, "Lecturer 5"));
        courses[2].addLecturer(new Lecturer(06, "Lecturer 6"));
        courses[2].addStudent(new Student(05, "Student 5"));
        courses[2].addStudent(new Student(06, "Student 6"));
    }
    
    void writeToFile(Course courses[]) {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter("testout.txt"));
            for (Course course : courses) {
                writer.println("Course ID: " + course.getCourseId() + ", Name: " + course.getCourseName());

                writer.println("Lecturers:");
                for (Lecturer lecturer : course.getLecturers()) {
                    writer.println("ID: " + lecturer.getId() + ", Name: " + lecturer.getName());
                }

                writer.println("Students:");
                for (Student student : course.getStudents()) {
                    writer.println("ID: " + student.getId() + ", Name: " + student.getName());
                }

                writer.println(); 
            }
            System.out.println("Success...");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void readFromFile(String fname) {
        try{ 
            BufferedReader in = new BufferedReader(new FileReader("testout.txt"));
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
