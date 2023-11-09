package org.example.zakruzhny;

public class PrimitiveTypeExamples {

    public void primitiveTypesShow(){
        byte byteVariable = 10;
        short shortVariable = 100;
        int intVariable = 1000;
        long longVariable = 10000;

        //авторасширение
        shortVariable = byteVariable;
        intVariable = byteVariable;
        longVariable = byteVariable;

        System.out.println(shortVariable);
        System.out.println(intVariable);
        System.out.println(longVariable);

        //явное cужение
        double doubleVariable = 20.2222222D;
        float floatExample = 20.999999F;

        float floatVariable = (float) doubleVariable;
        int intVariableFromDouble = (int) doubleVariable;

        System.out.println("float: " + floatVariable);
        System.out.println("From double to int: " + intVariableFromDouble);
    }
}
