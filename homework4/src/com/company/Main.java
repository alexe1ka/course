package com.company;

import com.company.mylist.MyLinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
//        testMyLinkedList();
//        compareMyLinkedListAndStandardLinkedList();

        TestCollection testCollection = new TestCollection();
        testCollection.makeWork();
        //
    }


    public static void testMyLinkedList() {
        // testMyList
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        System.out.println("" + myLinkedList.toString());
        myLinkedList.add(10);
        System.out.println("add(10) :" + myLinkedList.toString());
        myLinkedList.add(20);
        System.out.println("add(20) :" + myLinkedList.toString());
        myLinkedList.add(30);
        System.out.println("add(30) :" + myLinkedList.toString());
        myLinkedList.add(40);
        System.out.println("add(40) :" + myLinkedList.toString());
        myLinkedList.add(50);
        System.out.println("add(50) :" + myLinkedList.toString());
        myLinkedList.add(60);
        System.out.println("add(60) :" + myLinkedList.toString());
        myLinkedList.add(40);
        System.out.println("add(40) :" + myLinkedList.toString());
        myLinkedList.set(1, 0);
        System.out.println("set(1, 0) :" + myLinkedList.toString());
        myLinkedList.add(0, 35);
        System.out.println("add(0, 35) :" + myLinkedList.toString());
        myLinkedList.add(7, 11);
        System.out.println("add(7, 11) :" + myLinkedList.toString());
        myLinkedList.add(myLinkedList.size(), 22);
        System.out.println("add(myLinkedList.size(), 22) :" + myLinkedList.toString());
        myLinkedList.add(4, 33);
        System.out.println("add(4,33) :" + myLinkedList.toString());
        System.out.println("index of -5: " + myLinkedList.indexOf(-5));
        myLinkedList.remove(0);
        System.out.println("remove (0): " + myLinkedList.toString());
        myLinkedList.remove(5);
        System.out.println("remove (5): " + myLinkedList.toString());
        myLinkedList.remove(8);
        System.out.println("remove (8): " + myLinkedList.toString());

        try {
            myLinkedList.remove(myLinkedList.size());
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(myLinkedList.toString());
        Object[] array = myLinkedList.toArray();
        System.out.println("toArray: " + Arrays.toString(array));
        myLinkedList.clear();
        System.out.println("clear: " + myLinkedList.toString());
    }

    public static void compareMyLinkedListAndStandardLinkedList() {
        MyLinkedList<MyPoint> myLinkedList = new MyLinkedList<>();
        long startAddToMyList = System.nanoTime();
        for (int i = 0; i <= 100000; i++) {
            myLinkedList.add(new MyPoint(new Random().nextInt(10), new Random().nextInt(10)));
        }
        long addToMyListTime = System.nanoTime() - startAddToMyList;


        List<MyPoint> standardLinkedList = new LinkedList<>();
        long startAddToStandardList = System.nanoTime();
        for (int i = 0; i <= 100000; i++) {
            standardLinkedList.add(new MyPoint(new Random().nextInt(10), new Random().nextInt(10)));
        }
        long addToStandardListTime = System.nanoTime() - startAddToStandardList;
        System.out.println("Time of adding element to myLinkedList: " + addToMyListTime);
        System.out.println("Time of adding element to standard list: " + addToStandardListTime);


        long startFindToMyList = System.nanoTime();
        myLinkedList.indexOf(new MyPoint(new Random().nextInt(10), new Random().nextInt(10)));
        long findToMyListTime = System.nanoTime() - startFindToMyList;

        long startFindInStandardList = System.nanoTime();
        standardLinkedList.indexOf(new MyPoint(new Random().nextInt(10), new Random().nextInt(10)));
        long findStandardListTime = System.nanoTime() - startFindInStandardList;

        System.out.println("Time of finding element in myLinkedList: " + findToMyListTime);
        System.out.println("Time of finding element in standardLinkedList: " + findStandardListTime);


        long startDeleteElementInMyList = System.nanoTime();
        myLinkedList.remove(myLinkedList.size() / 2);
        long deleteInMyListTime = System.nanoTime() - startDeleteElementInMyList;

        long startDeleteElementInStandardList = System.nanoTime();
        standardLinkedList.remove(standardLinkedList.size() / 2);
        long deleteInStandardListTime = System.nanoTime() - startDeleteElementInStandardList;

        System.out.println("Time of deleting element in myLinkedList: " + deleteInMyListTime);
        System.out.println("Time of deleting element in standardLinkedList: " + deleteInStandardListTime);
    }
}
