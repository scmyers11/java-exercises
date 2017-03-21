package org.launchcode.java.inheritence;

/**
 * Created by stephen on 3/20/17.
 */
public class UndergraduateStudent extends Student {

    private String major;

    public UndergraduateStudent(String name, String studentId, double gpa, int numberOfCredits, boolean active, String schoolName) {
        super(name, studentId, gpa, numberOfCredits, active, schoolName);
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public GraduateStudent graduate() {
        return new GraduateStudent(this);
    }
}
