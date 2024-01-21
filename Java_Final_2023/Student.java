package Java_Final_2023;

public class Student extends Person {
    private float midtermScore;
    private float finalScore;

    public Student(int id, String name){
        super();
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
    
}
