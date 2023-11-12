package org.example.zakruzhny.modele.transport;

public class Car extends Transport {
    public Car(double speed) {
        super(speed);
    }

    public void startCarEngine(){
        super.startEngine();
    }
}
