package Java_Final_2_2023;

import java.io.*;

public class Student extends Person {
    private float[] midtermScores;  // Danh sách điểm giữa kỳ của các khóa học
    private float[] finalScores;    // Danh sách điểm cuối kỳ của các khóa học

    public Student(int id, String name, int numCourses) {
        super();
        setId(id);
        setName(name);
        this.midtermScores = new float[numCourses];
        this.finalScores = new float[numCourses];
    }

    public void setMidTermScore(int courseIndex, float midtermScore) {
        this.midtermScores[courseIndex] = midtermScore;
    }

    public void setFinalScore(int courseIndex, float finalScore) {
        this.finalScores[courseIndex] = finalScore;
    }

    public float getMidTermScore(int courseIndex) {
        return midtermScores[courseIndex];
    }

    public float getFinalScore(int courseIndex) {
        return finalScores[courseIndex];
    }

    // Thêm phương thức tính toán và in trạng thái Passed hoặc Retake
    public void calculateAndPrintStatus(PrintWriter writer) {
        float totalMidtermScore = 0;
        float totalFinalScore = 0;

        for (int i = 0; i < midtermScores.length; i++) {
            totalMidtermScore += midtermScores[i];
            totalFinalScore += finalScores[i];
        }

        float averageMidtermScore = totalMidtermScore / midtermScores.length;
        float averageFinalScore = totalFinalScore / finalScores.length;

        if (averageMidtermScore > 7 && averageFinalScore >= 10) {
            writer.println("Average Midterm Score: " + averageMidtermScore);
            writer.println("Average Final Score: " + averageFinalScore);
            writer.println("Status: Passed");
        } else {
            writer.println("Average Midterm Score: " + averageMidtermScore);
            writer.println("Average Final Score: " + averageFinalScore);
            writer.println("Status: Retake");
        }
    }

    // Thêm phương thức writeToFile vào class Student
    public void writeToFile(PrintWriter writer) {
        super.writeToFile(writer);
        for (int i = 0; i < midtermScores.length; i++) {
            writer.println("Midterm Score for Course " + (i + 1) + ": " + getMidTermScore(i));
            writer.println("Final Score for Course " + (i + 1) + ": " + getFinalScore(i));
        }
        calculateAndPrintStatus(writer);  // Gọi phương thức mới
    }

    // Thêm phương thức readFromFile vào class Student
    public void readFromFile(BufferedReader in) throws IOException {
        super.readFromFile(in);
        for (int i = 0; i < midtermScores.length; i++) {
            String midtermScoreLine = in.readLine();
            System.out.println(midtermScoreLine);

            String finalScoreLine = in.readLine();
            System.out.println(finalScoreLine);
        }
    }
}

