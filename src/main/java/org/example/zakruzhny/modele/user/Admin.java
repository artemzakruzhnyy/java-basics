package org.example.zakruzhny.modele.user;

public class Admin extends User{

    public Admin() {
        super("some_name");
        super.name = "some_name2";
        super.method1();
    }

    public void method2(){
        super.method1();
        System.out.println(super.name);
    }

}
