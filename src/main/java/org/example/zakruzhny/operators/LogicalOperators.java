package org.example.zakruzhny.operators;

public class LogicalOperators {

    public void makeLogicalActions() {
        boolean a = true;
        boolean b = true;

        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println(!b);

        while (a) {
            if (a && b) {
                System.out.println("Все тру");
                a = false;
            }
        }
    }
}
