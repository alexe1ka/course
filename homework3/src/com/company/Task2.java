package com.company;

import java.util.Scanner;

public class Task2 implements Task {

    @Override
    public void makeWork() {
        int n = 0;
        System.out.println("Please insert n: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        scanner.close();
        int factLoopValue, factRecValue;

        long startFactRecTime = System.nanoTime();
        factRecValue = factRec(n);
        long factRecTime = System.nanoTime() - startFactRecTime;

        long startFactLoopTime = System.nanoTime();
        factLoopValue = factLoop(n);
        long factLoopTime = System.nanoTime() - startFactLoopTime;

        System.out.println("factRec = " + factRecValue + ", time: " + factRecTime);
        System.out.println("factLoop = " + factLoopValue + ", time: " + factLoopTime);
    }


    //имеется ограничение на дипазаон,т.к тут int
    private int factRec(int n) {
        int res;
        if (n == 0) {
            return 1;
        }
        res = n * factRec(n - 1);
        return res;
    }

    private int factLoop(int n) {
        int res = n;
        for (int i = n - 1; i > 0; i--) {
            res *= i;
        }
        return res;
    }
}
