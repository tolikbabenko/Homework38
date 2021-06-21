package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        int[][] a = new int[5][8];
        int maxNumber = 0;
        int minNumber = 0;
        System.out.print("Two-dimensional array filled with random numbers:\n");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = random.nextInt(199) - 99;
            }
        }
        for (int i = 0; i < a.length; i++, System.out.println()) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
                if (maxNumber <= a[i][j]) {
                    maxNumber = a[i][j];
                }
                if (minNumber >= a[i][j]) {
                    minNumber = a[i][j];
                }
            }
        }
        System.out.print("\nMaximum value in this array:" + maxNumber + "\n");
        System.out.print("Minimum value in this array:" + minNumber + "\n");
    }
}
