package org.example.zakruzhny.modele.animal;

public class Cat {

    private int age;
    private double weigh;

    private char shortName;

    public Cat(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        return age == cat.age;
    }

    @Override
    public int hashCode() {
        return age;
    }

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
