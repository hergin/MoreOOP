package model;

import interfaces.StudentInfoProvider;

public class CustomStudentInfoProvider implements StudentInfoProvider {
    @Override
    public String getStudentName() {
        return null;
    }

    @Override
    public int getStudentID() {
        return 0;
    }
}
