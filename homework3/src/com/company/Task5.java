package com.company;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Random;

public class Task5 implements Task {
    @Override
    public void makeWork() {
        System.out.println("taskA");
        a();
        System.out.println("taskB");
        b();
        System.out.println("taskC");
        c();
        System.out.println("taskD");
        d();

    }

    private void a() {
        int[][] arr = createTwoDimArrayWithRandomNumbers(8, 8, 99, 1);
        int sumMain = 0, sumSide = 0;
        long multMain = 1L, multSide = 1L;

        seeArray(arr); //своя функция для отображения двумерного массива на экране

        //элементы главной диагонали
        for (int i = 0; i < arr.length; i++) {
            sumMain += arr[i][i];
            multMain *= arr[i][i];
//            System.out.println(arr[i][i]);
        }
        System.out.println();

        //элементы побочной диагонали
        for (int i = 0; i < arr.length; i++) {
            sumSide += arr[i][arr.length - i - 1];
            multSide *= arr[i][arr.length - i - 1];
//            System.out.println(arr[i][arr.length - i - 1]);
        }
        System.out.println("sumMainDiag = " + sumMain + ", multMainDiag = " + multMain + " ,sumSideDiag=" + sumSide + ", multSideDiag = " + multSide);
    }

    private void b() {
        int[][] arr = createTwoDimArrayWithRandomNumbers(8, 5, 199, -99);
        seeArray(arr);
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.print("Max elem is " + max + ". His index(s): ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == max) {
                    System.out.println("[" + i + "," + j + "] ");
                }
            }
        }

    }

    private void c() {
        int[][] arr = createTwoDimArrayWithRandomNumbers(8, 5, 21, -10);
        seeArray(arr);

        long maxMult = Integer.MIN_VALUE;
        long mult = 1;
        long[] multArr = new long[arr.length];

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            mult = 1;
            for (int j = 0; j < arr[i].length; j++) {
                mult *= arr[i][j];
            }
            multArr[i] = Math.abs(mult);


            if (Math.abs(mult) > maxMult) {
                maxMult = Math.abs(mult);
            }
        }
//        System.out.println("multArr: " + Arrays.toString(multArr));
        System.out.println("max mult is " + maxMult + " in string(s): ");
        for (int i = 0; i < multArr.length; i++) {
            if (multArr[i] == maxMult) {
                System.out.println(i);
            }
        }

    }

    private void d() {
        int[][] arr = createTwoDimArrayWithRandomNumbers(10, 7, 101, 0);
        seeArray(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i] = Task1.bubbleSort(arr[i]);
            }
        }
        System.out.println("\n" + "Sorted arr:");
        seeArray(arr);
    }

    private int[][] createTwoDimArrayWithRandomNumbers(int rowSize, int colSize, int boundOfRandom, int offset) {
        int[][] arr = new int[rowSize][colSize];
        Random random = new Random();
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                arr[i][j] = random.nextInt(boundOfRandom) + offset;
            }
        }
        return arr;
    }


    //более удобный вывод массива на экран
    //public static т.к. использую в task6
    private void seeArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
