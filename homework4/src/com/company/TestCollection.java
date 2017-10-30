package com.company;

import sun.reflect.generics.tree.Tree;

import java.util.*;

public class TestCollection {

    public void makeWork() {
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t test lists");
        testA();
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t test set's");
        testB();
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t test maps");
        testC();
    }

    private void testA() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();


        Random random = new Random();
        //заполнение с начала
        long startAddToArrayList = System.nanoTime();
        for (int i = 0; i <= 100000; i++) {
            arrayList.add(random.nextInt(1000));
        }
        long addTimeToArrayList = System.nanoTime() - startAddToArrayList;
        System.out.println("Add to arrayList time: " + addTimeToArrayList);


        long startAddToLinkedList = System.nanoTime();
        for (int i = 0; i <= 100000; i++) {
            linkedList.add(random.nextInt(1000));
        }
        long addTimeToLinkedList = System.nanoTime() - startAddToLinkedList;
        System.out.println("Add to linkedList time: " + addTimeToLinkedList);

        //add to first
        long startAddToFirstArrayList = System.nanoTime();
        for (int i = 0; i <= 10000; i++) {
            arrayList.add(i, i);
        }
        long addTimeToFirstArrayList = System.nanoTime() - startAddToFirstArrayList;
        System.out.println("Add to First arrayList time: " + addTimeToFirstArrayList);


        long startAddToFirstLinkedList = System.nanoTime();
        for (int i = 0; i <= 10000; i++) {
            linkedList.add(i, i);
        }
        long addTimeToFirstLinkedList = System.nanoTime() - startAddToFirstLinkedList;
        System.out.println("Add to First linkedList time: " + addTimeToFirstLinkedList);

        //add to middle
        long startAddToMiddleArrayList = System.nanoTime();
        for (int i = 0; i <= 10000; i++) {
            arrayList.add((arrayList.size() / 2) + i, i);
        }
        long addTimeToMiddleArrayList = System.nanoTime() - startAddToMiddleArrayList;
        System.out.println("Add to Middle arrayList time: " + addTimeToMiddleArrayList);


        long startAddToMiddleLinkedList = System.nanoTime();
        for (int i = 0; i <= 10000; i++) {
            linkedList.add((linkedList.size() / 2) + i, i);
        }
        long addTimeToMiddleLinkedList = System.nanoTime() - startAddToMiddleLinkedList;
        System.out.println("Add to Middle linkedList time: " + addTimeToMiddleLinkedList);


        //search
        int indexSearchElem = new Random().nextInt(100000);
        long startSearchArrayList = System.nanoTime();
        arrayList.indexOf(indexSearchElem);
        long searchTimeArrayList = System.nanoTime() - startSearchArrayList;
        System.out.println("Search in arrayList time: " + searchTimeArrayList);

        long startSearchLinkedList = System.nanoTime();
        linkedList.indexOf(indexSearchElem);
        long searchTimeLinkedList = System.nanoTime() - startSearchLinkedList;
        System.out.println("Search in linkedList time: " + searchTimeLinkedList);


        //delete random
        int indexDeleteElem = new Random().nextInt(100000);
        long startDeleteArrayList = System.nanoTime();
        arrayList.remove(indexDeleteElem);
        long deleteTimeArrayList = System.nanoTime() - startDeleteArrayList;
        System.out.println("Delete random element in arrayList time: " + deleteTimeArrayList);

        long startDeleteLinkedList = System.nanoTime();
        linkedList.remove(indexDeleteElem);
        long deleteTimeLinkedList = System.nanoTime() - startDeleteLinkedList;
        System.out.println("Delete random element in linkedList time: " + deleteTimeLinkedList);


        //deleteFirst
        long startDeleteFirstArrayList = System.nanoTime();
        arrayList.remove(0);
        long deleteFirstTimeArrayList = System.nanoTime() - startDeleteFirstArrayList;
        System.out.println("Delete first element in arrayList time: " + deleteFirstTimeArrayList);

        long startDeleteFirstLinkedList = System.nanoTime();
        linkedList.remove(0);
        long deleteFirstTimeLinkedList = System.nanoTime() - startDeleteFirstLinkedList;
        System.out.println("Delete first element in linkedList time: " + deleteFirstTimeLinkedList);

        //delete middle
        long startDeleteMiddleArrayList = System.nanoTime();
        arrayList.remove((arrayList.size() - 1) / 2);
        long deleteMiddleTimeArrayList = System.nanoTime() - startDeleteMiddleArrayList;
        System.out.println("Delete Middle element in arrayList time: " + deleteMiddleTimeArrayList);

        long startDeleteMiddleLinkedList = System.nanoTime();
        linkedList.remove((linkedList.size() - 1) / 2);
        long deleteMiddleTimeLinkedList = System.nanoTime() - startDeleteMiddleLinkedList;
        System.out.println("Delete Middle element in linkedList time: " + deleteMiddleTimeLinkedList);


        //delete last
        long startDeleteLastArrayList = System.nanoTime();
        arrayList.remove(arrayList.size() - 1);
        long deleteLastTimeArrayList = System.nanoTime() - startDeleteLastArrayList;
        System.out.println("Delete last element in arrayList time: " + deleteLastTimeArrayList);

        long startDeleteLastLinkedList = System.nanoTime();
        linkedList.remove(linkedList.size() - 1);
        long deleteLastTimeLinkedList = System.nanoTime() - startDeleteLastLinkedList;
        System.out.println("Delete last element in linkedList time: " + deleteLastTimeLinkedList);

    }

    private void testB() {
        HashSet<Integer> hashSet = new HashSet<>();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        //add  last
        long startAddHashSet = System.nanoTime();
        for (int i = 0; i <= 100000; i++) {
            hashSet.add(new Random().nextInt(1000));
        }
        long addToHashSetTime = System.nanoTime() - startAddHashSet;
        System.out.println("Add to hash set time: " + addToHashSetTime);


        long startAddLinkedHashSet = System.nanoTime();
        for (int i = 0; i <= 100000; i++) {
            linkedHashSet.add(new Random().nextInt(1000));
        }
        long addToLinkedHashSetTime = System.nanoTime() - startAddLinkedHashSet;
        System.out.println("Add to Linked hash set time: " + addToLinkedHashSetTime);


        long startAddTreeSet = System.nanoTime();
        for (int i = 0; i <= 100000; i++) {
            treeSet.add(new Random().nextInt(1000));
        }
        long addToTreeSetTime = System.nanoTime() - startAddTreeSet;
        System.out.println("Add to Tree set time: " + addToTreeSetTime);


        //search
        long searchHashSet = System.nanoTime();
        hashSet.contains(new Random().nextInt(1000));
        long searchHashSetTime = System.nanoTime() - searchHashSet;
        System.out.println("Search in hash set time: " + searchHashSetTime);


        long searchLinkedHashSet = System.nanoTime();
        linkedHashSet.contains(new Random().nextInt(1000));
        long searchLinkedHashSetTime = System.nanoTime() - searchLinkedHashSet;
        System.out.println("Search in linked hash set time: " + searchHashSetTime);


        long searchTreeSet = System.nanoTime();
        treeSet.contains(new Random().nextInt(1000));
        long searchTreeSetTime = System.nanoTime() - searchTreeSet;
        System.out.println("Search in tree set time: " + searchHashSetTime);


        //delete
        long startDeleteHashSet = System.nanoTime();
        hashSet.remove(new Random().nextInt(1000));
        long deleteHashSetTime = System.nanoTime() - startDeleteHashSet;
        System.out.println("Delete in hash set : " + deleteHashSetTime);

        long startDeleteLinkedHashSet = System.nanoTime();
        linkedHashSet.remove(new Random().nextInt(1000));
        long deleteLinkedHashSetTime = System.nanoTime() - startDeleteLinkedHashSet;
        System.out.println("Delete in linked hash set : " + deleteLinkedHashSetTime);

        long startDeleteTreeSet = System.nanoTime();
        treeSet.remove(new Random().nextInt(1000));
        long deleteTreeSetTime = System.nanoTime() - startDeleteTreeSet;
        System.out.println("Delete in tree set : " + deleteTreeSetTime);

    }

    private void testC() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        long startAddToHashMap = System.nanoTime();
        for (int i = 0; i <= 100000; i++) {
            hashMap.put("" + i, i);
        }
        long addTimeToHashMap = System.nanoTime() - startAddToHashMap;
        System.out.println("Add to hash map time: " + addTimeToHashMap);


        long startAddToLinkedHashMap = System.nanoTime();
        for (int i = 0; i <= 100000; i++) {
            linkedHashMap.put("" + i, i);
        }
        long addTimeToLinkedHashMap = System.nanoTime() - startAddToLinkedHashMap;
        System.out.println("Add to Linked hash map time: " + addTimeToLinkedHashMap);


        long startAddToTreeMap = System.nanoTime();
        for (int i = 0; i <= 100000; i++) {
            treeMap.put("" + i, i);
        }
        long addTimeToTreeMap = System.nanoTime() - startAddToTreeMap;
        System.out.println("Add to Tree map time: " + addTimeToTreeMap);


        //search element
        long startSearchInHashMap = System.nanoTime();
        for (int i = 0; i <= 100000; i++) {

        }
        long searchTimeToHashMap = System.nanoTime() - startSearchInHashMap;
        System.out.println("Search in hash map time: " + searchTimeToHashMap);


    }
}
