package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 implements Task {

    @Override
    public void makeWork() {
        int n = 0;
        System.out.println("Please insert n: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        scanner.close();
        int[] array = new int[n];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(500);
        }
        System.out.println(Arrays.toString(array));//исходный массив
        int[] array1 = Arrays.copyOf(array, array.length); //копии массивов для исследований трех алгоритмов
        int[] array2 = Arrays.copyOf(array, array.length);


        System.out.println("Исходный" + Arrays.toString(array));
        long startBubbleTime = System.nanoTime();
        System.out.println(Arrays.toString(bubbleSort(array)));
        long bubbleTime = System.nanoTime() - startBubbleTime;
        System.out.println("BubbleSort time : " + bubbleTime + "\n");

        System.out.println("Исходный" + Arrays.toString(array1));
        long startSelectionTime = System.nanoTime();
        System.out.println(Arrays.toString(selectionSort(array1)));
        long selectionTime = System.nanoTime() - startSelectionTime;
        System.out.println("SelectionSort time : " + selectionTime + "\n");

        System.out.println("Исходный" + Arrays.toString(array2));
        long startArraysSortTime = System.nanoTime();
        Arrays.sort(array2);
        long arraysSortTime = System.nanoTime() - startArraysSortTime;
        System.out.println(Arrays.toString(array2));
        System.out.println("ArraysSort time : " + arraysSortTime + "\n");
    }

    //можно добавить boolean invert для выбора порядка сортировки
    private int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }

    private int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int tmp = arr[min];
            arr[min] = arr[i];
            arr[i] = tmp;

        }
        return arr;
    }
}
