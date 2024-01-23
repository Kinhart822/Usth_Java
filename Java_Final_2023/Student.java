package Java_Final_2023;

import java.io.*;

public class Student extends Person {
    private float midtermScore;
    private float finalScore;

    public Student(int id, String name){
        super();
        setId(id);
        setName(name);
    }
    public void setMidTermScore(float midtermScore){
        this.midtermScore = midtermScore;
    }
    public void setFinalScore(float finalScore){
        this.finalScore = finalScore;
    }

    public float getMidTermScore(){
        return midtermScore;
    }
    public float getFinalScore(){
        return finalScore;
    }

    // Thêm phương thức writeToFile vào class Student
    public void writeToFile(PrintWriter writer) {
        super.writeToFile(writer);
        writer.println("Midterm Score: " + getMidTermScore());
        writer.println("Final Score: " + getFinalScore());
        String status = (getMidTermScore() > 7 && getFinalScore() >= 10) ? "Passed" : "Retake";
        writer.println("Status: " + status);
    }

    // Thêm phương thức readFromFile vào class Student
    public void readFromFile(BufferedReader in) throws IOException {
        super.readFromFile(in);
        String midTermScoreLine = in.readLine();
        String finalScoreLine = in.readLine();
        System.out.println(midTermScoreLine);
        System.out.println(finalScoreLine);
    }
    
}
