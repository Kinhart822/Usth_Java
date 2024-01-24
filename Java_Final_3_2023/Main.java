package Java_Final_3_2023;

public class Main {
    public static void main(String[] args) {
        Course course = new Course("Math");

        Student student1 = new Student("John Doe","15/1/2004", 8, 15, 20, 9, 16, 20);
        course.addStudent(student1);

        Student student2 = new Student("Jane Smith","14/1/2004", 7, 14, 0, 8, 15, 20);
        course.addStudent(student2);

        // Ghi thông tin khóa học ra file
        course.writeToFile(course);

        // Đọc thông tin từ file
        course.readFromFile(course);

    }
}
