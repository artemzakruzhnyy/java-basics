package org.example.zakruzhny;

public class Main {
    public static void main(String[] args) {

        Cat fiodr = new Cat();
        Cat timofei = new Cat();

        Hamster kuzma = new Hamster();
        Hamster kuzia = new Hamster();

        fiodr.say();
        timofei.say();

        kuzma.say();
        kuzia.say();

        PrimitiveTypeExamples primitiveTypeExamples = new PrimitiveTypeExamples();
        primitiveTypeExamples.primitiveTypesShow();

        //значения по умолчанию
        System.out.println("Age: " + timofei.getAge());
        System.out.println("Weigh: " + timofei.getWeigh());
        System.out.println("Short name: " + timofei.getShortName());
    }
}