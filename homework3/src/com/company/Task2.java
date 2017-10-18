package com.company;

import java.util.Scanner;

public class Task2 {

    public void makeWork() {
        int n = 0;
        System.out.println("Please insert n: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        scanner.close();
        System.out.println("factRec = " + factRec(n));
        System.out.println("factLoop = " + factLoop(n));
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
