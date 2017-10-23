package com.company.mylist;

import java.util.Iterator;

public class MyLinkedList<E> implements ILinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    transient int size = 0;

    @Override
    public void add(E element) {
        Node<E> node = new Node<>();
        node.setElement(element);

        if (tail == null)           //если список пуст
        {                           //то указываем ссылки начала и конца на новый элемент
            head = node;               //т.е. список теперь состоит из одного элемента
            tail = node;
        } else {
            tail.setNextNode(node);          //иначе "старый" последний элемент теперь ссылается на новый
            tail = node;               //а в указатель на последний элемент записываем адрес нового элемента
        }
        size++;
    }

    @Override
    public void add(int index, E element) {
        checkIndex(index);
        Node<E> newNode = new Node<>();
        newNode.setElement(element);
        Node<E> currentNode = getNodeByIndex(index);
        if (index == 0) {
            head = newNode;
            newNode.setNextNode(currentNode);
        } else {
            getNodeByIndex(index - 1).setNextNode(newNode);
            newNode.setNextNode(currentNode);
        }
        size++;
    }

    @Override
    public void clear() {
        for (Node<E> node = head; node != null; ) {
            Node<E> next = head.getNextNode();
            node.setNextNode(null);
            node.setElement(null);
            node = next;
        }
        head = tail = null;
        size = 0;
    }

    @Override
    public E get(int index) {
        checkIndex(index);
        return getNodeByIndex(index).getElement();
    }

    @Override
    public int indexOf(E element) {
        return 0;
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public E set(int index, E element) {
        checkIndex(index);
        Node<E> currentNode = getNodeByIndex(index);
        E value = currentNode.getElement();
        currentNode.setElement(element);
        return value;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object[] toArray() {

        return new Object[0];
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }


    private void checkIndex(int index) {
        if (!(index >= 0 && index <= size)) {
            throw new IndexOutOfBoundsException();
        }
    }

    private Node<E> getNodeByIndex(int index) {
        Node<E> node = head;
        for (int i = 0; i < index; i++)
            node = node.getNextNode();
        return node;
    }
}



