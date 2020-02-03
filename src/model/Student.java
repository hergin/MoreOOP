package model;

import interfaces.StudentInfoProvider;

public class Student extends Person {

    private final int STUDENT_ID;
    private double GPA;
    private static int nextId = 1000;

    public Student(String name, double GPA) {
        STUDENT_ID = getNextId();
        this.name = name;
        this.GPA = GPA;
    }

    public int getStudentId() {
        return STUDENT_ID;
    }

    public static int getNextId() {
        int id = nextId;
        nextId++;
        return id;
    }

    @Override
    public String fullName() {
        return name;
    }
}
