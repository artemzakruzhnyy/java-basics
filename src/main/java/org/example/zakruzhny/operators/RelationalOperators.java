package org.example.zakruzhny.operators;

public class RelationalOperators {

    public void makeRelationalActions() {
        int a = 24;
        int b = 13;
        int c = 55;

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(c <= b);

        if (a == b) {
            System.out.println("Они равны");
        } else if (a != b) {
            System.out.println("Они не равны");
        }

        while (a != 20) {
            System.out.println("Цикл продолжается");
            a--;
        }
    }
}
