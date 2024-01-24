package Java_Final_2_2023;

import java.io.*;
import java.util.ArrayList;

public class Course {
    private String courseName;
    private int courseId;
    private ArrayList<Student> students;
    private ArrayList<Lecturer> lecturers;

    public Course(int courseId, String courseName){
        this.courseName = courseName;
        this.courseId = courseId;
        this.lecturers = new ArrayList<Lecturer>();
        this.students = new ArrayList<Student>();
    }
    public int getCourseId(){
        return courseId;
    }
    public String getCourseName(){
        return courseName;
    }
    
    public void addLecturer(Lecturer lecturer) {
        lecturers.add(lecturer);
    }

    public void addStudent(Student student) {
        students.add(student);
    }
    public ArrayList<Lecturer> getLecturers() {
        return lecturers;
    }
    public ArrayList<Student> getStudents() {
        return students;
    }

     // Thêm phương thức writeToFile vào class Course
     public void writeToFile(PrintWriter writer) throws IOException {
        writer.println("Course ID: " + getCourseId() + ", Name: " + getCourseName());
        writer.println("\n  Lecturer(s):");
        for (Lecturer lecturer : getLecturers()) {
            lecturer.writeToFile(writer);
        }

        writer.println("\n  Student(s):");
        for (Student student : getStudents()) {
            student.writeToFile(writer);
        }

        writer.println();
    }

    // Thêm phương thức readFromFile vào class Course
    public void readFromFile(BufferedReader in) throws IOException {
        String courseIdLine = in.readLine();
        String courseNameLine = in.readLine();
        System.out.println(courseIdLine);
        System.out.println(courseNameLine);

        System.out.println("Lecturers:");
        Lecturer lecturer = new Lecturer(0, ""); 
        lecturer.readFromFile(in);

        System.out.println("Students:");
        Student student = new Student(0, "", 0); 
        student.readFromFile(in);
    }
}
        
    











