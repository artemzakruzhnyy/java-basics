package org.example.zakruzhny.operators;

public class ArithmeticOperators {

    public void makeArithmeticActions() {
        int x = 10;
        int y = 5;
        System.out.println("0. Целочисленное деление: " + x / y);
        System.out.println("0. Остаток от деления: " + x % y);

        // Будут ошибки
        //System.out.println("0. Деление на ноль с помощью '/': " + x / 0);
        //System.out.println("0. Деление на ноль с помощью '%': " + x % 0);

        x = 11;
        System.out.println("1. Целочисленное деление: " + x / y);
        System.out.println("1. Остаток от деления: " + x % y);

        double e = 22.5;
        System.out.println("2. Целочисленное деление: " + e / y);
        System.out.println("2. Остаток от деления: " + e % y);
        System.out.println("2. Деление на ноль с помощью '/': " + e / 0);
        System.out.println("2. Деление на ноль с помощью '%': " + e % 0);


        int a = 22;
        int b = a++;
        int c = ++a;

        System.out.println("3. Сначала присвоение, а потом инкремент: " + b);
        System.out.println("3. Сначала инкремент, а потом присвоение: " + c);
    }
}
