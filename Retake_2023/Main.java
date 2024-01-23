package Retake_2023;

public class Main {
    public static void main(String[] args) {
        Course oop = new Course("OOP");
        Course web = new Course("WEB");
        Course ip = new Course("IP");
        oop.addLecturer(new Lecturer("Lecturer 1"));
        oop.addLecturer(new Lecturer("Lecturer 2"));
        oop.addStudent(new Student(1, "Student 1", 8, 12, 16));
        oop.addStudent(new Student(2, "Student 2", 5, 10, 15));
        oop.saveToFile();

        web.addLecturer(new Lecturer("Lecturer 3"));
        web.addLecturer(new Lecturer("Lecturer 4"));
        web.addStudent(new Student(1, "Student 3", 9, 11, 14));
        web.addStudent(new Student(2, "Student 4", 6, 13, 17));
        web.saveToFile();

        ip.addLecturer(new Lecturer("Lecturer 5"));
        ip.addLecturer(new Lecturer("Lecturer 6"));
        ip.addStudent(new Student(1, "Student 5", 7, 15, 18));
        ip.addStudent(new Student(2, "Student 6", 10, 12, 14));
        ip.saveToFile();

        oop.loadFromFile();
        oop.displayAverageStudents();
        oop.displayGoodStudents();

        web.loadFromFile();
        web.displayAverageStudents();
        web.displayGoodStudents();

        ip.loadFromFile();
        ip.displayAverageStudents();
        ip.displayGoodStudents();
    }
}
