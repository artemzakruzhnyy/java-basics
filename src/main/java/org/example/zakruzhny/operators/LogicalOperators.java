package org.example.zakruzhny.operators;

import org.example.zakruzhny.modele.transport.Car;
import org.example.zakruzhny.modele.transport.SportCar;
import org.example.zakruzhny.modele.transport.Transport;

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

    public void callInstanceOf() {
        SportCar sportCar = new SportCar();
        Car car = new Car();
        Transport transport = new Transport();

        System.out.println(sportCar instanceof SportCar);
        System.out.println(sportCar instanceof Car);
        System.out.println(sportCar instanceof Transport);

        System.out.println(car instanceof Car);
        System.out.println(car instanceof Transport);

        System.out.println(transport instanceof SportCar);
        System.out.println(transport instanceof Car);
        System.out.println(transport instanceof Transport);

        System.out.println(car instanceof Object);
        Object obj1 = new Object();
        System.out.println(obj1 instanceof Object);
    }
}
