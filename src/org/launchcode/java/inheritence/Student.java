package org.launchcode.java.inheritence;

public class Student {

    private String name;
    private final String studentId;
    private double gpa;
    private int numberOfCredits;
    private boolean active;
    private String schoolName;

    public Student(String name, String studentId, double gpa, int numberOfCredits, boolean active, String schoolName) {
        this.name = name;
        this.studentId = studentId;
        this.gpa = gpa;
        this.numberOfCredits = numberOfCredits;
        this.active = active;
        this.schoolName = schoolName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
