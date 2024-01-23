package Retake_2023;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Course {
    private String courseName;
    private ArrayList<Lecturer> lecturers;
    private ArrayList<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        this.lecturers = new ArrayList<Lecturer>();
        this.students = new ArrayList<Student>();
    }

    public void addLecturer(Lecturer lecturer) {
        lecturers.add(lecturer);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public String getCourseName() {
        return courseName;
    }

    public ArrayList<Lecturer> getLecturers() {
        return lecturers;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void saveToFile() {
        try {
            FileWriter writer = new FileWriter(courseName + ".txt");
            writer.write(courseName + "\n");
            writer.write(lecturers.size() + "\n");
            for (Lecturer lecturer : lecturers) {
                writer.write(lecturer.getName() + "\n");
            }
            writer.write(students.size() + "\n");
            for (Student student : students) {
                writer.write(student.getId() + "\n");
                writer.write(student.getName() + "\n");
                writer.write(student.getAttendanceMark() + "\n");
                writer.write(student.getMidTermMark() + "\n");
                writer.write(student.getFinalMark() + "\n");
                writer.write(student.getFinalCourseMark() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Error saving to file");
        }
    }

    public void loadFromFile() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(courseName + ".txt"));
            courseName = reader.readLine();
            int numLecturers = Integer.parseInt(reader.readLine());
            for (int i = 0; i < numLecturers; i++) {
                lecturers.add(new Lecturer(reader.readLine()));
            }
            int numStudents = Integer.parseInt(reader.readLine());
            for (int i = 0; i < numStudents; i++) {
                int id = Integer.parseInt(reader.readLine());
                String name = reader.readLine();
                double attendanceMark = Double.parseDouble(reader.readLine());
                double midTermMark = Double.parseDouble(reader.readLine());
                double finalMark = Double.parseDouble(reader.readLine());
                students.add(new Student(id, name, attendanceMark, midTermMark, finalMark));
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error loading from file");
        }
    }

    public void displayAverageStudents() {
        System.out.println("Average Students: ");
        for (Student student : students) {
            if (student.getAttendanceMark() < 6 && student.getFinalCourseMark() < 10) {
                System.out.println("ID: " + student.getId() + ", Name: " + student.getName() + ", Attendance Mark: "
                        + student.getAttendanceMark() + ", Mid-term Mark: " + student.getMidTermMark()
                        + ", Final Mark: " + student.getFinalMark() + ", Final Course Mark: "
                        + student.getFinalCourseMark());
            }
        }
    }

    public void displayGoodStudents() {
        System.out.println("Good Students: ");
        for (Student student : students) {
            if (student.getAttendanceMark() >= 10 && student.getMidTermMark() <= 15 && student.getFinalMark() >= 16
                    && student.getFinalCourseMark() >= 13) {
                System.out.println("ID: " + student.getId() + ", Name: " + student.getName() + ", Attendance Mark: "
                        + student.getAttendanceMark() + ", Mid-term Mark: " + student.getMidTermMark()
                        + ", Final Mark: " + student.getFinalMark() + ", Final Course Mark: "
                        + student.getFinalCourseMark());
            }
        }
    }
}
