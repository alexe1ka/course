package com.company;

import com.sun.deploy.util.ArrayUtil;

import java.util.*;

public class Task4 implements Task {
    @Override
    public void makeWork() {
        //все доп.методы написаны свои,
        // т.к насколько я понял пользоваться Collections нельзя
        System.out.println("taskA");
        a();
        System.out.println("taskB");
        b();
        System.out.println("taskC");
        c();
        System.out.println("taskD");
        d();
        System.out.println("taskE");
        e();
        System.out.println("taskF");
        f();


    }


    private void a() {
        int[] a = new int[50];
        for (int i = 0, j = 0; i < 100; i++) {
            if (i % 2 != 0) {
                a[j] = i;
                j++;
            }
        }
        System.out.println(Arrays.toString(a));
        a = reverseArray(a);
        System.out.println(Arrays.toString(a));
    }

    private int[] reverseArray(int[] arr) {
        for (int qwa = 0; qwa < arr.length / 2; qwa++) {
            int tmp = arr[qwa];
            arr[qwa] = arr[arr.length - 1 - qwa];
            arr[arr.length - 1 - qwa] = tmp;
        }
        return arr;
    }

    private void b() {
        int[] array = createArrayWithRandomNumbers(20, 10, 0);
        System.out.println(Arrays.toString(array));
        int even = 0;
        for (int elem : array) {
            if (elem % 2 == 0) {
                even += 1;
            }
        }
        System.out.println("Count of even elem: " + even);
        System.out.println("Count of odd elem: " + (array.length - even));
    }

    private void c() {
        int[] array = createArrayWithRandomNumbers(10, 99, 1);//изначально [0,99]. если +1 то [1,100]
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    private void d() {
        int[] array = createArrayWithRandomNumbers(15, 101, -50);
        System.out.println(Arrays.toString(array));
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxIndex = -1, minIndex = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }

        System.out.println("max = " + max + " , index of max elem = " + maxIndex);
        System.out.println("min = " + min + " ,index of min elem = " + minIndex);
    }

    private void e() {
        int[] firstArray = createArrayWithRandomNumbers(10, 10, 0);

        int[] secondArray = createArrayWithRandomNumbers(10, 10, 0);

        System.out.println(Arrays.toString(firstArray) + " .avg = " + average(firstArray));
        System.out.println(Arrays.toString(secondArray) + " .avg = " + average(secondArray));
        double firstAvg = average(firstArray);
        double secondAvg = average(secondArray);
        if (firstAvg == secondAvg) {
            System.out.println("average of first array equal to second array");
        } else {
            if (firstAvg > secondAvg) {
                System.out.println("average of first array more than second array");
            } else {
                System.out.println("average of second array more than first array");
            }
        }
    }

    private double average(int[] arr) {
        double sum = 0;
        for (int elem : arr) {
            sum += elem;
        }
        return (sum / arr.length);
    }

    private void f() {
        int boundOfRandom = 3;//диапазон генератора случайных чисел
        int offset = -1;
        int[] arrrrray = createArrayWithRandomNumbers(20, boundOfRandom, offset);
        System.out.println(Arrays.toString(arrrrray));
        int[] countOfUniqueElemArr = new int[boundOfRandom];
        for (int element : arrrrray) {
            countOfUniqueElemArr[element - offset]++;
        }

        int maxCount = Integer.MIN_VALUE;
        for (int uniqueElement : countOfUniqueElemArr) {
            if (uniqueElement > maxCount) {
                maxCount = uniqueElement;
            }
        }

        System.out.println(Arrays.toString(countOfUniqueElemArr));
        System.out.println(maxCount);

        System.out.println("Max count of elem is: " + maxCount + ". Elem is:");
        for (int i = 0; i < countOfUniqueElemArr.length; i++) {
            if (countOfUniqueElemArr[i] == maxCount) {
                System.out.println((i + offset));
            }
        }
    }


    //метод для создания массива длины arraySize,заполненного случайными числами из диапазона [0,boundOFRandom]+offset
    //смещение смещает диапазон [0,bound] к диапазону [0+offset,bound+offset]
    private int[] createArrayWithRandomNumbers(int arraySize, int boundOfRandom, int offset) {
        int[] array = new int[arraySize];
        Random firstRandom = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = firstRandom.nextInt(boundOfRandom) + offset;
        }
        return array;
    }

}
