package Java_Final_5_2023;

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
    
    public void writeToFile() {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter("Total.txt", true));
            writer.println(courseName);
            for (Student student : students) {
                writer.println("\n  Student's name: " + student.getName());
                writer.println("  Student's Id : " + student.getId());
                writer.println("Student's mid-term mark: " + student.getMidTermScore(courseId));
                writer.println("Student's final mark: " + student.getFinalScore(courseId));
                student.calculateAndPrintStatus(writer);
            }
            System.out.println("Success...");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFromFile(String fileName) {
        try {
            BufferedReader in = new BufferedReader(new FileReader(fileName));
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

