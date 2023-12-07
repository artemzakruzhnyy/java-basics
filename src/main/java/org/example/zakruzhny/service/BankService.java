package org.example.zakruzhny.service;

public abstract class BankService {

    public static void printClassName(){
        System.out.println();
    }

    public abstract double calculateSimplePercent(double sum, double percent, int days);
}
