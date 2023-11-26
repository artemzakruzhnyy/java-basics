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

    public void printTypeCar() {
        /*switch ((int) getSpeed()) {
            case 250 -> System.out.println("");
            case 40 -> System.out.println("Машина детская!!!");
            default -> System.out.println("Машина обычная");
        }*/

        if (getSpeed() > 250) {
            System.out.println("Машина спортивная!!!");
        } else if (getSpeed() < 40) {
            System.out.println("Машина детская!!!");
        } else {
            System.out.println("Машина обычная");
        }
    }


    public void run() {
        int initSpeed = 0;

        while (initSpeed < 120) {
            System.out.println("Машина все езе разгоняется...");
            initSpeed += 10;
        }
        System.out.println("Машина разогналась!!!!");

        do {
            System.out.println("Машина все езе разгоняется...");
            initSpeed += 10;
        }
        while (initSpeed < 120);
        System.out.println("Машина разогналась!!!!");

        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i : array) {
            System.out.println("Елемент " + i);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println("Елемент " + array[i]);
        }
    }
}
