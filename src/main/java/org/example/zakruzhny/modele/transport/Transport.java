package org.example.zakruzhny.modele.transport;

public class Transport {
    private double speed;
    private String type;
    private int year;

    public Transport() {
    }

    public Transport(double speed){
        this.speed = speed;
    }

    public void startEngine(){
        System.out.println("Transport: Мотор завелся!");
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
