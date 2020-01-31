package model;

public class Professor extends Person {

    private String title;

    public Professor(String name, String title) {
        this.name = name;
        this.title = title;
    }

    @Override
    public String fullName() {
        return title + " " + name;
    }
}
