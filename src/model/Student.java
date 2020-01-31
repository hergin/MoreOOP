package model;

import interfaces.StudentInfoProvider;

public class Student extends Person {

    private int id;
    private double GPA;

    private static int nextID = 0;

    public Student(String name, double GPA) {
        this.id = getNextID();
        this.name = name;
        this.GPA = GPA;
    }

    private int getNextID() {
        int id = nextID;
        nextID++;
        return id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String fullName() {
        return name;
    }
}
