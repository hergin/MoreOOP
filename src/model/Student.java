package model;

import interfaces.StudentInfoProvider;

public class Student extends Person {

    private final int id;
    private double GPA;

    private static int nextID=1;  //Assign nextID with static

    public Student(String name, double GPA) {
        this.id = getNextID();  ////Make the id auto-incremented
        this.name = name;
        this.GPA = GPA;
    }

    public int getId() {
        return id;
    }

    public static int getNextID(){
        int id=nextID;  //Create a new variable
        nextID++;  //Add 1 to nextID++
        return id;  //return variable
    }

    @Override
    public String fullName() {
        return name;
    }
}
