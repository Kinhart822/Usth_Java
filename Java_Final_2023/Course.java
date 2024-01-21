package Java_Final_2023;

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

    public void displayStatus(){
        System.out.println("Student status: ");
        for (Student student : students){
            if (student.getMidTermScore() > 7 && student.getFinalScore() >= 10){
                System.out.println("ID: " + student.getId() + ", Name: " + student.getName() + " => Passed");
            } else {
                System.out.println("ID: " + student.getId() + ", Name: " + student.getName() + " => Retake");
            }
        }
    }
}
        
    











