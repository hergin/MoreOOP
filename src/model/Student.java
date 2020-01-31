package model;

import interfaces.StudentInfoProvider;

public class Student extends Person {

    private int id;
    private double GPA;
    private static int nextNewID = 0;

    public Student(String name, double GPA) {
        this.id = nextNewID++;
        this.name = name;
        this.GPA = GPA;
    }

    public int getId() {
        return id;
    }

    @Override
    public String fullName() {
        return name;
    }
}
