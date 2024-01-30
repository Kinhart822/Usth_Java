package Java_Final_5_2023;

public class Main {
    public static void main(String[] args){
        Course[] course = new Course[2];
        course[0] = new Course(0, "OOP");
        course[1] = new Course(1, "ADS");

        Lecturer lecturer1 = new Lecturer("b1", "Lecturer 1");
        course[0].addLecturer(lecturer1);
        Lecturer lecturer2 = new Lecturer("b2", "Lecturer 2");
        course[1].addLecturer(lecturer2);

        Student student1 = new Student("a1", "Student 1", 2); 
        student1.setMidTermScore(0, 8.5f); 
        student1.setMidTermScore(1, 7.0f); 
        student1.setFinalScore(0, 12.0f); 
        student1.setFinalScore(1, 10.0f); 
        course[0].addStudent(student1);
        course[1].addStudent(student1);

        Student student2 = new Student("a2", "Student 2", 2); 
        student2.setMidTermScore(0, 8.5f); 
        student2.setMidTermScore(1, 7.0f); 
        student2.setFinalScore(0, 12.0f); 
        student2.setFinalScore(1, 10.0f); 
        course[0].addStudent(student2);
        course[1].addStudent(student2);

        for (Course courses : course) {
            courses.writeToFile();
        }
        for (Course courses : course) {
            courses.readFromFile("Total.txt");
        }
    }
}
