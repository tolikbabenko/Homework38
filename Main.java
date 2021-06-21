package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[][] a = new int[8][5];
        int max, min;
        int maxNumber = -100;
        System.out.print("Two-dimensional array filled with random numbers:\n");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = ((int) (Math.random() * 200) - 99);
            }
        }
        for (int i = 0; i < a.length; i++, System.out.println()) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
                if (maxNumber <= a[i][j]) {
                    maxNumber = a[i][j];
                }
            }
        }
        System.out.print("\nMaximum value in this array:" + maxNumber + "\n");
    }
}