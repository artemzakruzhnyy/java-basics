package org.example.zakruzhny.array;

import org.example.zakruzhny.modele.transport.Car;

import java.util.Arrays;

public class ArrayService {

    public void createArray() {
        int[] array1 = new int[5];
        array1[0] = 32;
        array1[4] = 123;

        for (int i=0; i<array1.length+10; i++){
            //System.out.println(array1[i]);
        }

        int[] array2 = {10, 2, 3, 5, -1};
        for (int i: array2){
            //System.out.println(i);
        }

        int[][] matrix = {{1,13}, {34,45,-100}};
        System.out.println(matrix[1][2]);
    }

    public void methodsArray(){
        int[] a1 = {23, 43, 1};
        int[] a2 = {45, 1, 0};

        System.out.println(Arrays.equals(a1, a2));
        System.out.println(Arrays.compare(a1, a2));
        System.out.println();
    }
}
