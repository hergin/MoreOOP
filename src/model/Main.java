package model;

import model.CustomDisplayModifier;
import model.CustomStudentInfoProvider;
import model.Student;
import model.StudentInfoDisplay;

public class Main
{
    public static void main(String[] args)
    {
        Student s1 = new Student("Henry", 3.5);
        CustomStudentInfoProvider studentInformation = new CustomStudentInfoProvider(s1);

        //for first display version
        CustomDisplayModifier displayModifier = new CustomDisplayModifier();

        //for second display version
        AnotherDisplayModifier anotherDisplayModifier = new AnotherDisplayModifier();

        //display creation
        StudentInfoDisplay display0 = new StudentInfoDisplay(displayModifier, studentInformation);
        StudentInfoDisplay display1 = new StudentInfoDisplay(anotherDisplayModifier, studentInformation);

        display0.display();
        display1.display();
    }
}
