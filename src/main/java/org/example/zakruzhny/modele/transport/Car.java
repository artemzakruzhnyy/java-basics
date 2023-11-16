package org.example.zakruzhny.modele.transport;

public class Car extends Transport {

    private String transmission;

    public Car() {
    }

    public Car(double speed) {
        super(speed);
    }

    @Override
    public void startEngine() {
        System.out.println("Car: Запущен мотор машины!");
    }

    public void startEngine(String message) {
        System.out.println("Car: " + message);
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }
}
