package com.company;

import sun.reflect.generics.tree.Tree;

import java.util.*;

public class TestCollection {

    public void makeWork() {
//        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t test lists");
//        testA();
//        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t test set's");
//        testB();
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t test maps");
        testC();
    }

    private void testA() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();


        ArrayList<Integer> predgenerateArray = new ArrayList<>();
        for (int i = 0; i <= 100000; i++) {
            predgenerateArray.add(new Random().nextInt(1000));
        }


        //заполнение с начала
        long startAddToArrayList = System.nanoTime();
        for (int i = 0; i <= 100000; i++) {
            arrayList.add(predgenerateArray.get(i));
        }
        long addTimeToArrayList = System.nanoTime() - startAddToArrayList;
        System.out.println("Add to arrayList time: " + addTimeToArrayList);


        long startAddToLinkedList = System.nanoTime();
        for (int i = 0; i <= 100000; i++) {
            linkedList.add(predgenerateArray.get(i));
        }
        long addTimeToLinkedList = System.nanoTime() - startAddToLinkedList;
        System.out.println("Add to linkedList time: " + addTimeToLinkedList);

        //add to first
        long startAddToFirstArrayList = System.nanoTime();
        for (int i = 0; i <= 100000; i++) {
            arrayList.add(0, i);
        }
        long addTimeToFirstArrayList = System.nanoTime() - startAddToFirstArrayList;
        System.out.println("Add to First arrayList time: " + addTimeToFirstArrayList);


        long startAddToFirstLinkedList = System.nanoTime();
        for (int i = 0; i <= 100000; i++) {
            linkedList.add(0, i);
        }
        long addTimeToFirstLinkedList = System.nanoTime() - startAddToFirstLinkedList;
        System.out.println("Add to First linkedList time: " + addTimeToFirstLinkedList);

        //add to middle
        int sizeArr = arrayList.size() / 2;
        long startAddToMiddleArrayList = System.nanoTime();
        for (int i = 0; i <= 100000; i++) {
            arrayList.add(sizeArr + i, i);
        }
        long addTimeToMiddleArrayList = System.nanoTime() - startAddToMiddleArrayList;
        System.out.println("Add to Middle arrayList time: " + addTimeToMiddleArrayList);

        int sizeLink = linkedList.size() / 2;
        long startAddToMiddleLinkedList = System.nanoTime();
        for (int i = 0; i <= 100000; i++) {
            linkedList.add(sizeLink + i, i);
        }
        long addTimeToMiddleLinkedList = System.nanoTime() - startAddToMiddleLinkedList;
        System.out.println("Add to Middle linkedList time: " + addTimeToMiddleLinkedList);


        //search
        int indexSearchElem = new Random().nextInt(300000);
        long startSearchArrayList = System.nanoTime();
        arrayList.indexOf(indexSearchElem);
        long searchTimeArrayList = System.nanoTime() - startSearchArrayList;
        System.out.println("Search in arrayList time: " + searchTimeArrayList);

        long startSearchLinkedList = System.nanoTime();
        linkedList.indexOf(indexSearchElem);
        long searchTimeLinkedList = System.nanoTime() - startSearchLinkedList;
        System.out.println("Search in linkedList time: " + searchTimeLinkedList);

        //get
        int indexGetElem = new Random().nextInt(300000);
        long startGetArrayList = System.nanoTime();
        arrayList.get(indexGetElem);
        long getTimeArrayList = System.nanoTime() - startGetArrayList;
        System.out.println("Get from arrayList time: " + getTimeArrayList);

        long startGetLinkedList = System.nanoTime();
        linkedList.get(indexGetElem);
        long getTimeLinkedList = System.nanoTime() - startGetLinkedList;
        System.out.println("Get from linkedList time: " + getTimeLinkedList);


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
        int middleArrayIndex = (arrayList.size() - 1) / 2;
        int iterArrayIndex = 0;
        long startDeleteMiddleArrayList = System.nanoTime();
        while (iterArrayIndex < 100) {
            arrayList.remove(middleArrayIndex - iterArrayIndex);
            iterArrayIndex++;
        }
        long deleteMiddleTimeArrayList = System.nanoTime() - startDeleteMiddleArrayList;
        System.out.println("Delete Middle element in arrayList time: " + deleteMiddleTimeArrayList);

        int middleLinkedIndex = (linkedList.size() - 1) / 2;
        int iterLinkedIndex = 0;
        long startDeleteMiddleLinkedList = System.nanoTime();
        while (iterLinkedIndex < 100) {
            linkedList.remove(middleLinkedIndex - iterArrayIndex);
            iterLinkedIndex++;
        }
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

        ArrayList<Integer> predgenerateArray = new ArrayList<>();
        for (int i = 0; i <= 1000000; i++) {
            predgenerateArray.add(new Random().nextInt(1000000));
        }


        //add
        long startAddHashSet = System.nanoTime();
        for (int i = 0; i <= 1000000; i++) {
            hashSet.add(predgenerateArray.get(i));
        }
        long addToHashSetTime = System.nanoTime() - startAddHashSet;
        System.out.println("Add to hash set time: " + addToHashSetTime);


        long startAddLinkedHashSet = System.nanoTime();
        for (int i = 0; i <= 1000000; i++) {
            linkedHashSet.add(predgenerateArray.get(i));
        }
        long addToLinkedHashSetTime = System.nanoTime() - startAddLinkedHashSet;
        System.out.println("Add to Linked hash set time: " + addToLinkedHashSetTime);


        long startAddTreeSet = System.nanoTime();
        for (int i = 0; i <= 1000000; i++) {
            treeSet.add(predgenerateArray.get(i));
        }
        long addToTreeSetTime = System.nanoTime() - startAddTreeSet;
        System.out.println("Add to Tree set time: " + addToTreeSetTime);


        System.out.println("size of hashset: " + hashSet.size() + ",size of linkedhashset:" + linkedHashSet.size() + ",treeset size:" + treeSet.size());

        //search
        int searchElement = new Random().nextInt(100000);

        long searchHashSet = System.nanoTime();
        hashSet.contains(searchElement);
        long searchHashSetTime = System.nanoTime() - searchHashSet;
        System.out.println("Search in hash set time: " + searchHashSetTime);


        long searchLinkedHashSet = System.nanoTime();
        linkedHashSet.contains(searchElement);
        long searchLinkedHashSetTime = System.nanoTime() - searchLinkedHashSet;
        System.out.println("Search in linked hash set time: " + searchLinkedHashSetTime);


        long searchTreeSet = System.nanoTime();
        treeSet.contains(searchElement);
        long searchTreeSetTime = System.nanoTime() - searchTreeSet;
        System.out.println("Search in tree set time: " + searchTreeSetTime);


        //delete
        int removedElement = new Random().nextInt(100000);

        long startDeleteHashSet = System.nanoTime();
        hashSet.remove(removedElement);
        long deleteHashSetTime = System.nanoTime() - startDeleteHashSet;
        System.out.println("Delete in hash set : " + deleteHashSetTime);

        long startDeleteLinkedHashSet = System.nanoTime();
        linkedHashSet.remove(removedElement);
        long deleteLinkedHashSetTime = System.nanoTime() - startDeleteLinkedHashSet;
        System.out.println("Delete in linked hash set : " + deleteLinkedHashSetTime);

        long startDeleteTreeSet = System.nanoTime();
        treeSet.remove(removedElement);
        long deleteTreeSetTime = System.nanoTime() - startDeleteTreeSet;
        System.out.println("Delete in tree set : " + deleteTreeSetTime);

    }

    private void testC() {
        HashMap<Long, Integer> hashMap = new HashMap<>();
        LinkedHashMap<Long, Integer> linkedHashMap = new LinkedHashMap<>();
        TreeMap<Long, Integer> treeMap = new TreeMap<>();


        ArrayList<Long> key = new ArrayList<>();
        for (int i = 0; i <= 100000; i++) {
            key.add(System.nanoTime());
        }

        ArrayList<Integer> value = new ArrayList<>();
        for (int i = 0; i <= 100000; i++) {
            value.add(new Random().nextInt(100000));
        }


        long startAddToHashMap = System.nanoTime();
        for (int i = 0; i <= 100000; i++) {
            hashMap.put(key.get(i), value.get(i));
        }
        long addTimeToHashMap = System.nanoTime() - startAddToHashMap;
        System.out.println("Add to hash map time: " + addTimeToHashMap);


        long startAddToLinkedHashMap = System.nanoTime();
        for (int i = 0; i <= 100000; i++) {
            linkedHashMap.put(key.get(i), value.get(i));
        }
        long addTimeToLinkedHashMap = System.nanoTime() - startAddToLinkedHashMap;
        System.out.println("Add to Linked hash map time: " + addTimeToLinkedHashMap);


        long startAddToTreeMap = System.nanoTime();
        for (int i = 0; i <= 100000; i++) {
            treeMap.put(key.get(i), value.get(i));
        }
        long addTimeToTreeMap = System.nanoTime() - startAddToTreeMap;
        System.out.println("Add to Tree map time: " + addTimeToTreeMap);


        //search Key
        long findKey = key.get(key.size() / 2);

        long startSearchKeyInHashMap = System.nanoTime();
        for (int i = 0; i <= 100000; i++) {
            hashMap.containsKey(findKey);
        }
        long searchKeyTimeToHashMap = System.nanoTime() - startSearchKeyInHashMap;
        System.out.println("Search Key in hash map time: " + searchKeyTimeToHashMap);

        long startSearchKeyInLinkedHashMap = System.nanoTime();
        for (int i = 0; i <= 100000; i++) {
            linkedHashMap.containsKey(findKey);
        }
        long searchKeyTimeToLinkedHashMap = System.nanoTime() - startSearchKeyInLinkedHashMap;
        System.out.println("Search Key in Linked hash map time: " + searchKeyTimeToLinkedHashMap);

        long startSearchKeyInTreeMap = System.nanoTime();
        for (int i = 0; i <= 100000; i++) {
            treeMap.containsKey(findKey);
        }
        long searchKeyTimeToTreeMap = System.nanoTime() - startSearchKeyInTreeMap;
        System.out.println("Search Key in Tree map time: " + searchKeyTimeToTreeMap);


        //search Value
        int findValue = new Random().nextInt(100000);

        long startSearchInHashMap = System.nanoTime();
        for (int i = 0; i <= 100000; i++) {
            hashMap.containsValue(findValue);
        }
        long searchTimeToHashMap = System.nanoTime() - startSearchInHashMap;
        System.out.println("Search in hash map time: " + searchTimeToHashMap);

        long startSearchInLinkedHashMap = System.nanoTime();
        for (int i = 0; i <= 100000; i++) {
            linkedHashMap.containsValue(findValue);
        }
        long searchTimeToLinkedHashMap = System.nanoTime() - startSearchInLinkedHashMap;
        System.out.println("Search in Linked hash map time: " + searchTimeToLinkedHashMap);

        long startSearchInTreeMap = System.nanoTime();
        for (int i = 0; i <= 100000; i++) {
            treeMap.containsValue(findValue);
        }
        long searchTimeToTreeMap = System.nanoTime() - startSearchInTreeMap;
        System.out.println("Search in Tree map time: " + searchTimeToTreeMap);

        //delete element
        long deleteKey = key.get(key.size() / 2);
        long startDeleteElementInHashMap = System.nanoTime();
        for (int i = 0; i <= 100000; i++) {
            hashMap.remove(deleteKey);
        }
        long deleteElementInHashMap = System.nanoTime() - startDeleteElementInHashMap;
        System.out.println("delete in hash map time: " + deleteElementInHashMap);

        long startDeleteElementInLinkedHashMap = System.nanoTime();
        for (int i = 0; i <= 100000; i++) {
            linkedHashMap.remove(deleteKey);
        }
        long deleteElementInLinkedHashMap = System.nanoTime() - startDeleteElementInLinkedHashMap;
        System.out.println("delete in linked hash map time: " + deleteElementInLinkedHashMap);

        long startDeleteElementInTreeMap = System.nanoTime();
        for (int i = 0; i <= 100000; i++) {
            treeMap.remove(deleteKey);
        }
        long deleteElementInTreeMap = System.nanoTime() - startDeleteElementInTreeMap;
        System.out.println("delete in tree map time: " + deleteElementInTreeMap);

    }
}
