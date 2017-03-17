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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Course course = (Course) o;

        if (name != null ? !name.equals(course.name) : course.name != null) return false;
        if (time != null ? !time.equals(course.time) : course.time != null) return false;
        if (teacherName != null ? !teacherName.equals(course.teacherName) : course.teacherName != null) return false;
        if (classroomNumber != null ? !classroomNumber.equals(course.classroomNumber) : course.classroomNumber != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (teacherName != null ? teacherName.hashCode() : 0);
        result = 31 * result + (classroomNumber != null ? classroomNumber.hashCode() : 0);
        result = 31 * result + (students != null ? students.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", time='" + time + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", classroomNumber='" + classroomNumber + '\'' +
                ", students=" + students +
                '}';
    }
}
