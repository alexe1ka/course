package com.company;

import java.util.Random;

public class Task4 {

    public void makeWork() {
        taskB();

    }

    private void taskA() {

    }

    private void taskB() {
        int[] array = new int[20];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        seeArrayOnScreen(array);


    }

    private void taskC() {

    }

    private void taskD() {

    }

    private void taskE() {

    }

    private void taskF() {

    }

    private void seeArrayOnScreen(int[] arr) {
        for (int anArr : arr) {
            System.out.print(" " + anArr);
        }
    }
}
