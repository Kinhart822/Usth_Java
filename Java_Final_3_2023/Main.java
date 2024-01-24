package Java_Final_3_2023;

public class Main {
    public static void main(String[] args) {

        Course course = new Course("Math");

        Student student1 = new Student("John Doe", 8, 15, 20, 9, 16, 22);
        course.addStudent(student1);

        Student student2 = new Student("Jane Smith", 7, 14, 18, 8, 15, 20);
        course.addStudent(student2);

        // Ghi thông tin khóa học ra file
        course.writeToFile(course);

        // Đọc thông tin từ file
        course.readFromFile(course);

        // Hiển thị thông tin sinh viên sau khi đọc từ file
        for (Student student : course.getStudents) {
            System.out.println("\nStudent's name: " + student.getFullName());
            System.out.println("Student's birthday: " + student.getDateOfBirth());
            System.out.println("Student's final course mark full year: " + student.getFinalCourseMarkFullYear());
        }
    }
}
