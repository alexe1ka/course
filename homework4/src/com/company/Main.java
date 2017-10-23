package com.company;

import com.company.mylist.MyLinkedList;
import com.company.mylist.Node;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(10);
        myLinkedList.add(20);
        myLinkedList.add(30);
        myLinkedList.add(40);
        myLinkedList.add(50);
        myLinkedList.add(60);
        myLinkedList.add(40);
        myLinkedList.set(1, 0);
        myLinkedList.add(0, 35);
        myLinkedList.add(7, 11);
        myLinkedList.add(myLinkedList.size(), 22);
        myLinkedList.add(4, 33);
        //myLinkedList.clear();

        System.out.println(myLinkedList.toString());
//        myLinkedList.remove(0);
//        System.out.println(myLinkedList.toString());
        myLinkedList.remove(myLinkedList.size());
        System.out.println(myLinkedList.toString());
        myLinkedList.remove(3);
        System.out.println(myLinkedList.toString());


        System.out.println(myLinkedList.indexOf(-5));

    }
}
