package model;

import interfaces.StudentInfoProvider;

public class Student extends Person {

    private int id;
    private double GPA;

    private static int nextID = 1000;

    public Student(String name, double GPA) {
        this.id = nextID++;
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
