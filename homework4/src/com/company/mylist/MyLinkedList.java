package com.company.mylist;

import java.util.Iterator;

public class MyLinkedList implements ILinkedList {
    private Node head;
    private Node tail;

    @Override
    public void add(Object element) {
        Node node = new Node();
        node.setElement(element);

        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.setNextNode(head);
            head = node;
        }

    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public int indexOf(Object element) {
        return 0;
    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
