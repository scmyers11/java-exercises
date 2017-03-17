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

    public Student(String name, String studentId) {
        this(name, studentId, 0, 0);
    }

    public void addGrade(double grade, int numberOfCredits) {
        this.gpa = ((this.gpa * this.numberOfCredits) + (grade * numberOfCredits)) / (this.numberOfCredits + numberOfCredits);
    }

    public String getGradeLevel() {
        if(this.numberOfCredits < 30) {
            return "Freshman";
        } else if(this.numberOfCredits < 60) {
            return "Sophomore";
        } else if(this.numberOfCredits < 90) {
            return "Junior";
        } else {
            return "Senior";
        }
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (Double.compare(student.gpa, gpa) != 0) return false;
        if (numberOfCredits != student.numberOfCredits) return false;
        if (name != null ? !name.equals(student.name) : student.name != null) return false;
        return studentID != null ? studentID.equals(student.studentID) : student.studentID == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + (studentID != null ? studentID.hashCode() : 0);
        temp = Double.doubleToLongBits(gpa);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + numberOfCredits;
        return result;
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
