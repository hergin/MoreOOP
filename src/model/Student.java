package model;

import interfaces.StudentInfoProvider;

public class Student extends Person {

    private int id;
    private static int nextID;
    private double GPA;

    public Student(String name, double GPA) {
        this.id = 0;
        this.name = name;
        this.GPA = GPA;
        this.id = nextID++;
    }

    public int getId() {
        return id;
    }

    @Override
    public String fullName() {
        return name;
    }
}
