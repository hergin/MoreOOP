package model;

import interfaces.StudentInfoProvider;

public class Student extends Person {

    private int id;
    private static int nextID = 1;
    private double GPA;

    public Student(String name, double GPA) {
        this.id = getNextId();
        this.name = name;
        this.GPA = GPA;
    }

    public int getId() {
        return id;
    }

    public static int getNextId() {
        int id = nextID;
        nextID++;
        return id;
    }

    @Override
    public String fullName() {
        return name;
    }
}
