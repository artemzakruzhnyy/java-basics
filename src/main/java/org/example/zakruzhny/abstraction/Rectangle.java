package org.example.zakruzhny.abstraction;

public class Rectangle implements Shape {

    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int calculateArea() {
        return this.a * this.b;
    }

    @Override
    public void display() {
        System.out.println("Display Rectangle!");
    }

    @Override
    public void superDisplay() {

    }

    @Override
    public void superSuperDisplay() {

    }
}
