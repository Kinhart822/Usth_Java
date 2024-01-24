package Java_Final_3_2023;

public class Student extends Person {
    private String name;
    private String DOB;
    private double attendanceMarkYear1;
    private double midTermMarkYear1;
    private double finalMarkYear1;
    private double finalCourseMarkYear1;
    private double attendanceMarkYear2;
    private double midTermMarkYear2;
    private double finalMarkYear2;
    private double finalCourseMarkYear2;
    private double finalCourseMarkFullYear;

    public Student(String fullName, double attendanceMarkYear1, double midTermMarkYear1, double finalMarkYear1, double attendanceMarkYear2, double midTermMarkYear2, double finalMarkYear2){
        super();
        setFullName(name);
        setDateOfBirth(DOB);
        this.attendanceMarkYear1 = attendanceMarkYear1;
        this.midTermMarkYear1 = midTermMarkYear1;
        this.finalMarkYear1 = finalMarkYear1;
        this.finalCourseMarkYear1 = (attendanceMarkYear1 * 0.1) + (midTermMarkYear1 * 0.4) + (finalMarkYear1 * 0.5);
        this.attendanceMarkYear2 = attendanceMarkYear2;
        this.midTermMarkYear2 = midTermMarkYear2;
        this.finalMarkYear2 = finalMarkYear2;
        this.finalCourseMarkYear2 = (attendanceMarkYear2 * 0.1) + (midTermMarkYear1 * 0.3) + (finalMarkYear1 * 0.6);
        this.finalCourseMarkFullYear = (finalMarkYear1 + finalMarkYear2)/2;
    }
    
    public double getAttendanceMarkYear1() {
        return attendanceMarkYear1;
    }

    public double getMidTermMarkYear1() {
        return midTermMarkYear1;
    }

    public double getFinalMarkYear1() {
        return finalMarkYear1;
    }

    public double getFinalCourseMarkYear1() {
        return finalCourseMarkYear1;
    }

    public double getAttendanceMarkYear2() {
        return attendanceMarkYear2;
    }

    public double getMidTermMarkYear2() {
        return midTermMarkYear2;
    }

    public double getFinalMarkYear2() {
        return finalMarkYear2;
    }

    public double getFinalCourseMarkYear2() {
        return finalCourseMarkYear2;
    }

    public double getFinalCourseMarkFullYear() {
        return finalCourseMarkFullYear;
    }
}
