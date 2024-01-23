package Retake_2023;

class Student extends Person {
    private int id;
    private double attendanceMark;
    private double midTermMark;
    private double finalMark;
    private double finalCourseMark;
    public String displayGoodStudents;
    public String displayAverageStudents;

    public Student(int id, String name, double attendanceMark, double midTermMark, double finalMark) {
        super();
        setName(name); 
        this.id = id;
        this.attendanceMark = attendanceMark;
        this.midTermMark = midTermMark;
        this.finalMark = finalMark;
        this.finalCourseMark = (attendanceMark * 0.1) + (midTermMark * 0.4) + (finalMark * 0.5);
    }

    public int getId() {
        return id;
    }

    public double getAttendanceMark() {
        return attendanceMark;
    }

    public double getMidTermMark() {
        return midTermMark;
    }

    public double getFinalMark() {
        return finalMark;
    }

    public double getFinalCourseMark() {
        return finalCourseMark;
    }
}