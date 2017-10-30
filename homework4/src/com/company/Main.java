package com.company;

import com.company.mylist.MyLinkedList;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        testMyLinkedList();
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t Compare my list and standard linkedList");
        compareMyLinkedListAndStandardLinkedList();
        
        TestCollection testCollection = new TestCollection();
        testCollection.makeWork();

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
        LinkedList<MyPoint> standardLinkedList = new LinkedList<>();


        //данные,которые будут соваться в массив
        ArrayList<Integer> randomX = new ArrayList<>();
        for (int i = 0; i <= 100000; i++) {
            randomX.add(new Random().nextInt(10));
        }
        ArrayList<Integer> randomY = new ArrayList<>();
        for (int i = 0; i <= 100000; i++) {
            randomY.add(new Random().nextInt(10));
        }


        //add
        long startAddToMyList = System.nanoTime();
        for (int i = 0; i <= 100000; i++) {
            myLinkedList.add(new MyPoint(randomX.get(i), randomY.get(i)));
        }
        long addToMyListTime = System.nanoTime() - startAddToMyList;
        System.out.println("Time of adding element to myLinkedList: " + addToMyListTime);


        long startAddToStandardList = System.nanoTime();
        for (int i = 0; i <= 100000; i++) {
            standardLinkedList.add(new MyPoint(randomX.get(i), randomY.get(i)));
        }
        long addToStandardListTime = System.nanoTime() - startAddToStandardList;
        System.out.println("Time of adding element to standard list: " + addToStandardListTime);


        //add to middle
        long startAddToMiddleMyList = System.nanoTime();
        for (int i = 0; i <= 10000; i++) {
            myLinkedList.add((myLinkedList.size() - 1) / 2, new MyPoint(randomX.get(i), randomY.get(i)));
        }
        long addMiddleToMyListTime = System.nanoTime() - startAddToMiddleMyList;
        System.out.println("Time of adding element in Middle to myLinkedList: " + addMiddleToMyListTime);


        long startAddMiddleToStandardList = System.nanoTime();
        for (int i = 0; i <= 10000; i++) {
            standardLinkedList.add((standardLinkedList.size() - 1) / 2, new MyPoint(randomX.get(i), randomY.get(i)));
        }
        long addMiddleToStandardListTime = System.nanoTime() - startAddMiddleToStandardList;
        System.out.println("Time of adding element in middle to standard list: " + addMiddleToStandardListTime);


        //add to first
        long startAddToStartMyList = System.nanoTime();
        for (int i = 0; i <= 10000; i++) {
            myLinkedList.add(0, new MyPoint(randomX.get(i), randomY.get(i)));
        }
        long addStartToMyListTime = System.nanoTime() - startAddToStartMyList;
        System.out.println("Time of adding element to start to myLinkedList: " + addStartToMyListTime);


        long startAddToStartStandardList = System.nanoTime();
        for (int i = 0; i <= 10000; i++) {
            standardLinkedList.add(0, new MyPoint(randomX.get(i), randomY.get(i)));
        }
        long addStartToStandardListTime = System.nanoTime() - startAddToStartStandardList;
        System.out.println("Time of adding element to start to standard list: " + addStartToStandardListTime);


        //search
        long startFindToMyList = System.nanoTime();
        myLinkedList.indexOf(new MyPoint(randomX.get(randomX.size() / 2), randomY.get(randomY.size() / 2)));
        long findToMyListTime = System.nanoTime() - startFindToMyList;
        System.out.println("Time of finding element in myLinkedList: " + findToMyListTime);

        long startFindInStandardList = System.nanoTime();
        standardLinkedList.indexOf(new MyPoint(randomX.get(randomX.size() / 2), randomY.get(randomY.size() / 2)));
        long findStandardListTime = System.nanoTime() - startFindInStandardList;
        System.out.println("Time of finding element in standardLinkedList: " + findStandardListTime);


        long startDelete0ElementInMyList = System.nanoTime();
        myLinkedList.remove(0);
        long delete0InMyListTime = System.nanoTime() - startDelete0ElementInMyList;
        System.out.println("Time of deleting 0 element in myLinkedList: " + delete0InMyListTime);

        long startDelete0ElementInStandardList = System.nanoTime();
        standardLinkedList.remove(0);
        long delete0InStandardListTime = System.nanoTime() - startDelete0ElementInStandardList;
        System.out.println("Time of deleting 0 element in standardLinkedList: " + delete0InStandardListTime);


        long startDeleteElementInMyList = System.nanoTime();
        myLinkedList.remove(myLinkedList.size() / 2);
        long deleteInMyListTime = System.nanoTime() - startDeleteElementInMyList;
        System.out.println("Time of deleting middle element in myLinkedList: " + deleteInMyListTime);

        long startDeleteElementInStandardList = System.nanoTime();
        standardLinkedList.remove(myLinkedList.size() / 2);
        long deleteInStandardListTime = System.nanoTime() - startDeleteElementInStandardList;
        System.out.println("Time of deleting middle element in standardLinkedList: " + deleteInStandardListTime);

    }
}
