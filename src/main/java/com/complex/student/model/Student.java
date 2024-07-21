package com.complex.student.model;


import java.util.Objects;

public class Student {

    private String studentName;
    private String parentName;
    private Integer studentAge;
    private String standard;
    private String section;
    private Integer rollNumber;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public Integer getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(Integer studentAge) {
        this.studentAge = studentAge;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public Integer getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(Integer rollNumber) {
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return "Student:\n" +
                "  Student Name: '" + studentName + "'\n" +
                "  Parent Name: '" + parentName + "'\n" +
                "  Student Age: " + studentAge + "\n" +
                "  standard: '" + standard + "'\n" +
                "  section: '" + section + "'\n" +
                "  Roll Number: " + rollNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(studentName, student.studentName) && Objects.equals(parentName, student.parentName) && Objects.equals(studentAge, student.studentAge) && Objects.equals(standard, student.standard) && Objects.equals(section, student.section) && Objects.equals(rollNumber, student.rollNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentName, parentName, studentAge, standard, section, rollNumber);
    }


    public Student(String studentName, String parentName, Integer studentAge, String standard, String section, Integer rollNumber) {
        this.studentName = studentName;
        this.parentName = parentName;
        this.studentAge = studentAge;
        this.standard = standard;
        this.section = section;
        this.rollNumber = rollNumber;
    }

    public Student(String studentName) {
        this.studentName = studentName;
    }
}
