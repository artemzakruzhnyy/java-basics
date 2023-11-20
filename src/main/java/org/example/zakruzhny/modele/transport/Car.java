package org.example.zakruzhny.modele.transport;

public class Car extends Transport {

    private String transmission;

    private int oilLevel;

    public Car() {
    }

    public Car(double speed) {
        super(speed);
    }

    @Override
    public void startEngine() {
        if (checkOil() && checkTransmission()) {
            System.out.println("Car: Запущен мотор машины!");
        } else {
            System.out.println("Car: Мотор не может быть запущен!");
        }
    }

    public void startEngine(String message) {
        System.out.println("Car: " + message);
    }

    private boolean checkOil() {
        if (this.oilLevel != 0) {
            System.out.println("Масло не в норме!");
            return false;
        }
        System.out.println("Масло в норме!");
        return true;
    }

    private boolean checkTransmission() {
        System.out.println("Коробка передач в норме!");
        return true;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public int getOilLevel() {
        return oilLevel;
    }

    public void setOilLevel(int oilLevel) {
        this.oilLevel = oilLevel;

    }
}
