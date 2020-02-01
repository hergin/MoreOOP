package model;

import interfaces.StudentInfoProvider;

public class CustomStudentInfoProvider implements StudentInfoProvider {
    //Member Variable
    private Student student;

    //Constructor
    public CustomStudentInfoProvider(Student student) {
        this.student = student;
    }

    @Override
    public String getStudentName() {
        return student.fullName();
    }

    @Override
    public int getStudentID() {
        return student.getId();
    }
}
