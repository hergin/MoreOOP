package model;

import interfaces.StudentInfoProvider;

public class CustomStudentInfoProvider implements StudentInfoProvider {
    private Student student;
    @Override
    public String getStudentName() {
        return this.student.fullName();
    }

    @Override
    public int getStudentID() {
        return this.student.getId();

    }
    public CustomStudentInfoProvider(Student student){
        this.student = student;
    }
}
