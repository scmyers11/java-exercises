package org.launchcode.java.school;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Course {

    private final String name;
    private String time;
    private String teacherName;
    private String classroomNumber;
    private Map<String, Student> students;

    public Course(String name, String time, String teacherName, String classroomNumber, List<Student> students) {
        this.name = name;
        this.time = time;
        this.teacherName = teacherName;
        this.classroomNumber = classroomNumber;
        this.students = new HashMap<>();
        for(Student s : students) {
            this.addStudent(s);
        }
    }

    public String getName() {
        return name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getClassroomNumber() {
        return classroomNumber;
    }

    public void setClassroomNumber(String classroomNumber) {
        this.classroomNumber = classroomNumber;
    }

    public List<Student> getStudents() {
        return (List<Student>) students.values();
    }

    public void setStudents(List<Student> students) {
        for(Student s : students) {
            this.addStudent(s);
        }
    }

    public void addStudent(Student student) {
        if(!this.students.containsKey(student.getStudentID())) {
            this.students.put(student.getStudentID(), student);
        }
    }

    public void dropStudent(Student student) {
        if(this.students.containsKey(student.getStudentID())) {
            this.students.remove(student.getStudentID());
        }
    }
}
