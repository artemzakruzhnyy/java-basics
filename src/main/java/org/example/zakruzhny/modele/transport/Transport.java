package org.example.zakruzhny.modele.transport;

public class Transport {
    private double speed;

    public Transport(double speed){
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    void startEngine(){
        System.out.println("Мотор завелся!");
    }
}
