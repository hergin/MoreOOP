package model;

import interfaces.StudentInfoProvider;

public class Student extends Person {

    private final int studentId;
    private double GPA;

    private static int nextID = 100;

    public Student(String name, double GPA) {
        studentId = getNextID();
        this.name = name;
        this.GPA = GPA;
    }

    public int getId() {
        return studentId;
    }

    @Override
    public String fullName() {
        return name;
    }

    public static int getNextID()
    {
        int id = nextID;
        nextID++;
        return(id);
    }
}
