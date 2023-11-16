package org.example.zakruzhny.modele.transport;

public class Ship extends Transport {

    private int cabinsNumber;

    public Ship() {
    }

    public Ship(int cabinsNumber) {
        this.cabinsNumber = cabinsNumber;
    }

    public Ship(double speed, int cabinsNumber) {
        super(speed);
        this.cabinsNumber = cabinsNumber;
    }

    @Override
    public void startEngine() {
        System.out.println("Ship: Запущен мотор корабля!");
    }

    public int getCabinsNumber() {
        return cabinsNumber;
    }

    public void setCabinsNumber(int cabinsNumber) {
        this.cabinsNumber = cabinsNumber;
    }
}
