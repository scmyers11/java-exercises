package org.launchcode.java.school;

public class Student {
    private String name;
    private final String studentID;
    private double gpa;
    private int numberOfCredits;

    public Student(String name, String studentID, double gpa, int numberOfCredits) {
        this.name = name;
        this.studentID = studentID;
        this.gpa = gpa;
        this.numberOfCredits = numberOfCredits;
    }

    public String getName() {
        return this.name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public String getStudentID() {
        return studentID;
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentID='" + studentID + '\'' +
                ", gpa=" + gpa +
                ", numberOfCredits=" + numberOfCredits +
                '}';
    }
}
