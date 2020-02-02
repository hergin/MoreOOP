package model;

import interfaces.StudentInfoProvider;

public class CustomStudentInfoProvider implements StudentInfoProvider
{
    private Student student0;

    public CustomStudentInfoProvider(Student s0)
    {
        this.student0 = s0;
    }

    public String getStudentName()
    {
        return(student0.fullName());
    }

    public int getStudentID()
    {
        return(student0.getId());
    }
}
