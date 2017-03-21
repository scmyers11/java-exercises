package org.launchcode.java.inheritence;

import java.util.ArrayList;
import java.util.List;

public class GraduateStudent extends Student {

    private String schoolName;
    private double loanValue;
    private double scholarshipValue;
    private boolean thesisComplete;
    private List<String> undergradDegrees;

    public GraduateStudent(UndergraduateStudent student) {
        super(student.getName(), student.getStudentId(), student.getGpa(), student.getNumberOfCredits(), student.isActive(), student.getSchoolName());
        this.undergradDegrees = new ArrayList<>();
        this.undergradDegrees.add(student.getMajor());
    }

    public GraduateStudent(String name, String studentId, double gpa, int numberOfCredits, boolean active, String schoolName, double loanValue, double scholarshipValue, boolean thesisComplete, String undergradDegree) {
        super(name, studentId, gpa, numberOfCredits, active, schoolName);
        this.loanValue = loanValue;
        this.scholarshipValue = scholarshipValue;
        this.thesisComplete = thesisComplete;
    }


}
