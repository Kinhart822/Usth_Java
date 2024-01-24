package Java_Final_3_2023;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<Student> students;
    public Student[] getStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<Student>();
    }

    public String getCourseName() {
        return courseName;
    }
    
    public void addStudent(Student student) {
        students.add(student);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void writeToFile(Course course) {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(courseName + ".txt"));
            writer.println(courseName);
            for (Student student : students) {
                writer.println("\n  Student's name: " + student.getFullName());
                writer.println("  Student's birthday : " + student.getDateOfBirth());
                writer.println("Student's attendance mark year 1: " + student.getAttendanceMarkYear1());
                writer.println("Student's mid-term mark year 1: " + student.getMidTermMarkYear1());
                writer.println("Student's final mark year 1: " + student.getFinalMarkYear1());
                writer.println("Student's final course mark year 1: " + student.getFinalCourseMarkYear1());
                writer.println("Student's attendance mark year 2: " + student.getAttendanceMarkYear2());
                writer.println("Student's mid-term mark year 2: " + student.getMidTermMarkYear2());
                writer.println("Student's final mark year 2: " + student.getFinalMarkYear2());
                writer.println("Student's final course mark year 2: " + student.getFinalCourseMarkYear2());
                writer.println("Student's final course mark full year: " + student.getFinalCourseMarkFullYear());
                if (student.getFinalCourseMarkFullYear() >= 15) {
                    writer.println("=> The very good math student");
                } else {
                    writer.println("=> The very bad student");
                }
            }
            System.out.println("Success...");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFromFile(Course course) {
        try {
            BufferedReader in = new BufferedReader(new FileReader(courseName + ".txt"));
            courseName = in.readLine();
            int numStudents = Integer.parseInt(in.readLine());
            for (int i = 0; i < numStudents; i++) {
                String name = in.readLine();
                String DOB = in.readLine();
                double attendanceMarkYear1 = Double.parseDouble(in.readLine());
                double midTermMarkYear1 = Double.parseDouble(in.readLine());
                double finalMarkYear1 = Double.parseDouble(in.readLine());
                double attendanceMarkYear2 = Double.parseDouble(in.readLine());
                double midTermMarkYear2 = Double.parseDouble(in.readLine());
                double finalMarkYear2 = Double.parseDouble(in.readLine());
                students.add(new Student(name, DOB, attendanceMarkYear1, midTermMarkYear1, finalMarkYear1, attendanceMarkYear2, midTermMarkYear2, finalMarkYear2));
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
