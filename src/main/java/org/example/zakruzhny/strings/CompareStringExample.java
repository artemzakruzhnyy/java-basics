package org.example.zakruzhny.strings;

public class CompareStringExample {

    public void compareStringExample(){
        String str1;
        String str2;

        str1 = "Artsiom";
        str2 = "Artsiom";
        String str3 = new String("Artsiom");

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));
    }
}
