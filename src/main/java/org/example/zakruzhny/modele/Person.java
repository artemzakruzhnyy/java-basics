package org.example.zakruzhny.modele;

public class Person {

    // поля класса
    int age;
    double weight;
    double height;
    static boolean active;

    // нестатический блок инициализации
    {
        age = 25;
        int increaseAge = age * 2;
        System.out.println("Non static block: " + increaseAge);
    }

    //статический блок инициализации
    static {
        active = true;
        boolean nonActive = !active;
        System.out.println("Static block: " + nonActive);
    }

    public Person() {
        System.out.println("Default Constructor");
    }

    // конструктор
    public Person(int age, double weight, double height) {
        System.out.println("Constructor");
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    // методы класса
    public void printAmountOfChildren(int childrenAmount) {
        System.out.println("I have " + childrenAmount);
    }

    // геттер
    public int getAge() {
        return age;
    }

    // сеттер
    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
