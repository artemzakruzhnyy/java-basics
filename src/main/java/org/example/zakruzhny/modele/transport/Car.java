package org.example.zakruzhny.modele.transport;

public class Car extends Transport {

    private String transmission;

    public Car(double speed) {
        super(speed);
    }

    public void startCarEngine(){
        super.startEngine();
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }
}
