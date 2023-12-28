package org.example.zakruzhny.wrappers;

public class WrapperClasses {

    public void wrapperNumberClassManipulations() {
        Double a = 24D;
        Double b = Double.valueOf("123");
        Double c = Double.parseDouble("342");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public void wrapperBooleanClassManipulations() {
        Boolean boolean1 = Boolean.valueOf("TRUe");
        Boolean boolean2 = Boolean.parseBoolean("true123");

        System.out.println(boolean1);
        System.out.println(boolean2);

        System.out.println(Boolean.logicalAnd(boolean1, boolean2));
        System.out.println(Boolean.logicalOr(boolean1, boolean2));
        System.out.println(Boolean.logicalXor(boolean1, boolean2));
    }

    public void wrapperCharacterClassManipulations() {
        Character ch1 = 'c';
        Character ch2 = Character.valueOf('1');

        System.out.println(ch1);
        System.out.println(ch2);
    }

}
