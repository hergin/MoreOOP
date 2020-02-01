package model;

import interfaces.StudentInfoProvider;

public class Student extends Person {

    private int id;
    private static int nextId = 0;
    private double GPA;

    public Student(String name, double GPA) {
        this.id = 0;
        this.id = nextId++;
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
