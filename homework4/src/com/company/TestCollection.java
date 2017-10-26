package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class TestCollection {

    public void makeWork() {
        testA();
    }

    private void testA() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        long startAddToArrayList = System.nanoTime();
        for (int i = 0; i <= 100000; i++) {
            arrayList.add(new Random().nextInt(1000));
        }
        long addTimeToArrayList = System.nanoTime() - startAddToArrayList;
        System.out.println("Add to arrayList time: " + addTimeToArrayList);

        LinkedList<Integer> linkedList = new LinkedList<>();
        long startAddToLinkedList = System.nanoTime();
        for (int i = 0; i <= 100000; i++) {
            linkedList.add(new Random().nextInt(1000));
        }
        long addTimeToLinkedList = System.nanoTime() - startAddToLinkedList;
        System.out.println("Add to linkedList time: " + addTimeToLinkedList);

        int indexSearchElem = new Random().nextInt(100000);
        long startSearchArrayList = System.nanoTime();
        arrayList.indexOf(indexSearchElem);
        long searchTimeArrayList = System.nanoTime() - startSearchArrayList;
        System.out.println("Search in arrayList time: " + searchTimeArrayList);

        long startSearchLinkedList = System.nanoTime();
        linkedList.indexOf(indexSearchElem);
        long searchTimeLinkedList = System.nanoTime() - startSearchLinkedList;
        System.out.println("Search in linkedList time: " + searchTimeLinkedList);


        int indexDeleteElem = new Random().nextInt(100000);
        long startDeleteArrayList = System.nanoTime();
        arrayList.remove(indexDeleteElem);
        long deleteTimeArrayList = System.nanoTime() - startDeleteArrayList;
        System.out.println("Delete element in arrayList time: " + deleteTimeArrayList);

        long startDeleteLinkedList = System.nanoTime();
        linkedList.remove(indexDeleteElem);
        long deleteTimeLinkedList = System.nanoTime() - startDeleteLinkedList;
        System.out.println("Delete element in linkedList time: " + deleteTimeLinkedList);


    }

    private void testB() {


    }

    private void testC() {


    }
}
