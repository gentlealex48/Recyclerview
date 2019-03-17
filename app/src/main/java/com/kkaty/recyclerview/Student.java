package com.kkaty.recyclerview;

public class Student {

    public Student(String studentName, String studentGrad) {
        this.studentName = studentName;
        this.studentGrad = studentGrad;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentGrad() {
        return studentGrad;
    }

    public void setStudentGrad(String studentGrad) {
        this.studentGrad = studentGrad;
    }

    String studentName;
    String studentGrad;

}
