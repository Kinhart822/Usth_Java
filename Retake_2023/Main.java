package Retake_2023;

public class Main {
    public static void main(String[] args) {
        Course[] courses = new Course[3];
        courses[0] = new Course("OOP");
        courses[1] = new Course("WEB");
        courses[2] = new Course("IP");

        // Thêm giáo viên và sinh viên cho khóa học OOP
        Lecturer lecturer1 = new Lecturer("Lecturer 1");
        courses[0].addLecturer(lecturer1);
        Lecturer lecturer2 = new Lecturer("Lecturer 2");
        courses[0].addLecturer(lecturer2);
        Student student1 = new Student(1, "Student 1", 5, 12, 8);
        courses[0].addStudent(student1);
        Student student2 = new Student(2, "Student 2", 10, 15, 16);
        courses[0].addStudent(student2);
        Student student3 = new Student(3, "Student 3", 9, 11, 14);
        courses[0].addStudent(student3);
        
        // Thêm giáo viên và sinh viên cho khóa học WEB
        Lecturer lecturer3 = new Lecturer("Lecturer 3");
        courses[1].addLecturer(lecturer3);
        Lecturer lecturer4 = new Lecturer("Lecturer 4");
        courses[1].addLecturer(lecturer4);
        Student student4 =new Student(1, "Student 4", 6, 13, 17);
        courses[1].addStudent(student4);


        // Thêm giáo viên và sinh viên cho khóa học IP
        Lecturer lecturer5 = new Lecturer("Lecturer 5");
        courses[2].addLecturer(lecturer5);
        Lecturer lecturer6 = new Lecturer("Lecturer 6");
        courses[2].addLecturer(lecturer6);
        Student student5 = new Student(1, "Student 5", 7, 15, 18);
        courses[2].addStudent(student5);
        Student student6 =new Student(2, "Student 6", 10, 12, 14);
        courses[2].addStudent(student6);

        for (Course course : courses) {
            course.writeToFile();
        }
        for (Course course : courses) {
            course.readFromFile(courses);
        }

    }
}
