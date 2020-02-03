package model;

import interfaces.StudentInfoProvider;

public class CustomStudentInfoProvider implements StudentInfoProvider {
    @Override
    public String getStudentName() {
        return student.fullName();
    }
    Student student;

    public CustomStudentInfoProvider(Student student) {
        this.student = student;
    }

    @Override
    public int getStudentID() {
        return student.getStudentId();
    }
}
