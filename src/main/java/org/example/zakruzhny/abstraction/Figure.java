package org.example.zakruzhny.abstraction;

public abstract class Figure {

    private String name;

    public Figure(String name) {
        this.name = name;
    }

    public abstract int calculateArea();

    public abstract void display();

    public String getName() {
        return name;
    }
}
