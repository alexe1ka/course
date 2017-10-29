package com.company.mylist;

import java.util.Iterator;

public class MyLinkedList<E> implements ILinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size = 0;

    @Override
    public void add(E element) {
        Node<E> node = new Node<>(element);

        if (tail != null) {
            tail.next = node;          //иначе "старый" последний элемент теперь ссылается на новый
            tail = node;               //а в указатель на последний элемент записываем адрес нового
        } else {
            head = node;            // если список пуст то указываем ссылки начала и конца на новый элемент
            tail = head;            //т.е. список теперь состоит из одного элемента
        }
        size++;
    } //добавляет в конец

    @Override
    public void add(int index, E element) {//добавляет по индексу,смещая элемент с текущим индексом вправо
        checkPositionIndex(index);
        Node<E> newNode = new Node<>(element);
        Node<E> currentNode = getNodeByIndex(index);
        if (index == 0) {
            head = newNode;
            newNode.next = currentNode;
        } else if (index == size) {
            getNodeByIndex(index - 1).next = newNode;
            tail = newNode;
            newNode.next = currentNode;
        } else {
            getNodeByIndex(index - 1).next = newNode;
            newNode.next = currentNode;
        }
        size++;
    }

    @Override
    public void clear() {
        for (Node<E> node = head; node != null; ) {
            Node<E> next = head.next;
            node.next = null;
            node.elem = null;
            node = next;
        }
        head = tail = null;
        size = 0;
    }

    @Override
    public E get(int index) {
        checkPositionIndex(index);
        return getNodeByIndex(index).elem;
    }

    @Override
    public E set(int index, E element) {
        checkPositionIndex(index);
        Node<E> currentNode = getNodeByIndex(index);
        E value = currentNode.elem;
        currentNode.elem = element;
        return value;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int indexOf(E element) {
        //возвращает индекс первого вхождения
        int index = 0;
        if (element != null) {
            for (Node<E> node = head; node != null; node = node.next) {
                if (element.equals(node.elem)) {
                    return index;
                }
                index++;
            }
        } else {
            throw new UnsupportedOperationException();
        }
        return -1; //-1  - ПРИЗНАК ОТСУТСТВИЯ ДАННОГО ЭЛЕМЕНТА
    }

    @Override
    public E remove(int index) {
        checkElementIndex(index);
        Node<E> currentRemovedNode = getNodeByIndex(index);
        if (index == 0) {
            if (head.next != null) {
                head = head.next;
                size--;
                return currentRemovedNode.elem;
            }
        } else if (index == size - 1) {
            getNodeByIndex(index - 1).next = (null);
            size--;
            return currentRemovedNode.elem;
        } else if (index >= 0 && index < size) {
            getNodeByIndex(index - 1).next = (currentRemovedNode.next);
            size--;
            return currentRemovedNode.elem;
        }
        return null;
    }

    @Override
    public Object[] toArray() {
        Object[] result = new Object[size];
        int i = 0;
        for (Node<E> node = head; node != null; node = node.next) {
            result[i++] = node.elem;
        }
        return result;
    }

    @Override
    public String toString() {
        Iterator<E> it = iterator();
        if (!it.hasNext())
            return "[]";
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (; ; ) {
            E e = it.next();
            sb.append(e == this ? "(this Collection)" : e);
            if (!it.hasNext())
                return sb.append(']').toString();
            sb.append(',').append(' ');
        }
    }

    @Override
    public Iterator<E> iterator() {
        Iterator<E> iterator = new Iterator<E>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < size;
            }

            @Override
            public E next() {
                if (!hasNext()) {
                    return null;
                }
                return getNodeByIndex(currentIndex++).elem;
            }
        };
        return iterator;
    }


    private void checkPositionIndex(int index) {//позиция [size] это элемент за границей массива.последний элемент добавляется как раз на индекс size
        if (!(index >= 0 && index <= size)) {
            throw new IndexOutOfBoundsException();
        }
    }

    private void checkElementIndex(int index) {//удалять элементы мы можем с индексами с 0 до size-1
        if (!(index >= 0 && index < size)) {
            throw new IndexOutOfBoundsException();
        }
    }


    private Node<E> getNodeByIndex(int index) {
        Node<E> node = head;
        for (int i = 0; i < index; i++)
            node = node.next;
        return node;
    }

    private static class Node<E> {
        E elem;
        Node<E> next;

        public Node(E item) {
            this.elem = item;
        }

        Node(E element, Node<E> next) {
            this.elem = element;
            this.next = next;
        }
    }
}



