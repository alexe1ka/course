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
        myLinkedList.set(2,0);
        myLinkedList.clear();

    }
}
