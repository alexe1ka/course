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
        myLinkedList.set(1,0);
        myLinkedList.add(0,35);
        myLinkedList.add(6,11);
        myLinkedList.clear();

    }
}
