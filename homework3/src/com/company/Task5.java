package com.company;

import java.util.Arrays;
import java.util.Random;

public class Task5 implements Task {
    @Override
    public void makeWork() {
        a();
    }

    private void a() {
        int[][] arr = createTwoDimArrayWithRandomNumbers(8, 8, 100, 1);
//        System.out.println(Arrays.deepToString(arr));
        int sum = 0;
        int mult = 1;//переполнение
        seeArray(arr);

        //элементы главной диагонали
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
            mult *= arr[i][i];
            System.out.println(arr[i][i]);
        }
        System.out.println();

        //элементы побочной диагонали
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][arr.length - i - 1];
            mult *= arr[i][arr.length - i - 1];
            System.out.println(arr[i][arr.length - i - 1]);
        }
        System.out.println("sum = " + sum + " ,mult = " + mult);
    }

    private void b() {

    }

    private void c() {

    }

    private void d() {

    }

    private int[][] createTwoDimArrayWithRandomNumbers(int colSize, int rowSize, int boundOfRandom, int offset) {
        int[][] arr = new int[colSize][rowSize];
        Random random = new Random();
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                arr[i][j] = random.nextInt(boundOfRandom) + offset;
            }
        }
        return arr;
    }

    //более удобный вывод массива на экран
    private void seeArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
