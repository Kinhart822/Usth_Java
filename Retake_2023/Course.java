package Retake_2023;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

class Course {
    private String courseName;
    private ArrayList<Lecturer> lecturers;
    private ArrayList<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        this.lecturers = new ArrayList<Lecturer>();
        this.students = new ArrayList<Student>();
    }

    public String getCourseName() {
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
            PrintWriter writer = new PrintWriter(new FileWriter(courseName + ".txt", true));
            writer.println(courseName + "\n");
            for (Lecturer lecturer : lecturers) {
                writer.println("Lecturer's name: " + lecturer.getName());
            }
            for (Student student : students) {
                writer.println("\n  Student's name: " + student.getName());
                writer.println("Student's id: " + student.getId());
                writer.println("Student's attendance mark: " + student.getAttendanceMark());
                writer.println("Student's mid-term mark: " + student.getMidTermMark());
                writer.println("Student's final mark: " + student.getFinalMark());
                writer.println("Student's final course mark: " + student.getFinalCourseMark());
                if (student.getAttendanceMark() < 6 && student.getFinalCourseMark() < 10) {
                    writer.println("Average student");
                } else if(student.getAttendanceMark() >= 10 && student.getMidTermMark() <= 15 && student.getFinalMark() >= 16 && student.getFinalCourseMark() >= 13){
                    writer.println("Good student");
                } else  {
                    writer.println("Bad student");
                }
            }
            System.out.println("Success...");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFromFile(Course[] courses) {
        try {
            BufferedReader in = new BufferedReader(new FileReader(courseName + ".txt"));
            courseName = in.readLine();
            int numLecturers = Integer.parseInt(in.readLine());
            for (int i = 0; i < numLecturers; i++) {
                lecturers.add(new Lecturer(in.readLine()));
            }
            int numStudents = Integer.parseInt(in.readLine());
            for (int i = 0; i < numStudents; i++) {
                int id = Integer.parseInt(in.readLine());
                String name = in.readLine();
                double attendanceMark = Double.parseDouble(in.readLine());
                double midTermMark = Double.parseDouble(in.readLine());
                double finalMark = Double.parseDouble(in.readLine());
                students.add(new Student(id, name, attendanceMark, midTermMark, finalMark));
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}