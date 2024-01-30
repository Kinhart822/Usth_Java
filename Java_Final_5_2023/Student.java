package Java_Final_5_2023;

import java.io.PrintWriter;

public class Student extends Person {
    private double[] midTermMark;
    private double[] finalMark;

    public Student(String id, String name, int numCourses){
        super();
        setId(id);
        setName(name);
        this.midTermMark = new double[numCourses];
        this.finalMark = new double[numCourses];
    }
    public void setMidTermScore(int courseIndex, double midtermScore) {
        this.midTermMark[courseIndex] = midtermScore;
    }

    public void setFinalScore(int courseIndex, double finalScore) {
        this.finalMark[courseIndex] = finalScore;
    }

    public double getMidTermScore(int courseIndex) {
        return midTermMark[courseIndex];
    }

    public double getFinalScore(int courseIndex) {
        return finalMark[courseIndex];
    }

    // Thêm phương thức tính toán và in trạng thái Passed hoặc Retake
    public void calculateAndPrintStatus(PrintWriter writer) {
        double totalMidtermScore = 0;
        double totalFinalScore = 0;

        for (int i = 0; i < midTermMark.length; i++) {
            totalMidtermScore += midTermMark[i];
        }
        for (int i = 0; i < finalMark.length; i++) {
            totalFinalScore += finalMark[i];
        }

        double averageMidtermScore = totalMidtermScore / midTermMark.length;
        double averageFinalScore = totalFinalScore / finalMark.length;

        if (averageMidtermScore > 7 && averageFinalScore >= 10) {
            writer.println("Average Midterm Score: " + averageMidtermScore);
            writer.println("Average Final Score: " + averageFinalScore);
            writer.println("Status: Passed  \n");
        } else {
            writer.println("Average Midterm Score: " + averageMidtermScore);
            writer.println("Average Final Score: " + averageFinalScore);
            writer.println("Status: Retake  \n");
        }
    }
}
 
