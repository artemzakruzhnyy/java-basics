package org.example.zakruzhny.modele.animal;

public class Cat {

    private int age;
    private double weigh;

    private char shortName;

    public void say(){
        System.out.println("May");
    }

    public int getAge() {
        return age;
    }

    public double getWeigh() {
        return weigh;
    }

    public char getShortName() {
        return shortName;
    }

    public void setShortName(char shortName) {
        this.shortName = shortName;
    }
}
