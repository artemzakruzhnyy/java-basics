package org.example.zakruzhny.modele.user;

public class User {

    public String name;

    public User(String name) {
        this();
        this.name = name;
        this.method1();
    }

    public void method1(){
        System.out.println("Вызов из метода!");
    }

    public User(){
        System.out.println("Вызов из конструктора по умолчанию!");
    }
}
