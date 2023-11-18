package org.example.zakruzhny.abstraction;

public interface Shape extends SuperShape, SuperSuperShape {

    String name = null;

    int calculateArea();

    void display();

    static void staticMethod() {
        System.out.println("Static method");
    }

    default void defaultMethod() {
        System.out.println("Static method");
    }
}
