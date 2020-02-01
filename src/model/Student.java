package model;

import interfaces.StudentInfoProvider;

public class Student extends Person {

    private int id;
    private static int nextID = 0;
    private double GPA;

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
