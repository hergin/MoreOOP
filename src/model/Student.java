package model;

import interfaces.StudentInfoProvider;

public class Student extends Person {

    private final int id;
    private double GPA;

    private static int nextId = 1000;

    public Student(String name, double GPA) {
        this.id = getnextId();
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

    public static int getnextId(){
        int id = nextId;
        nextId++;
        return id;
    }
}
