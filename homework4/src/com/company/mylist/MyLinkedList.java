package com.company.mylist;

import java.util.Iterator;

public class MyLinkedList<E> implements ILinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size = 0;

    @Override
    public void add(E element) {
        Node<E> node = new Node<>(element);

        if (tail == null)           //если список пуст
        {                           //то указываем ссылки начала и конца на новый элемент
            head = node;               //т.е. список теперь состоит из одного элемента
            tail = node;
        } else {
            tail.setNextNode(node);          //иначе "старый" последний элемент теперь ссылается на новый
            tail = node;               //а в указатель на последний элемент записываем адрес нового элемента
        }
        size++;
    } //добавляет в конец

    @Override
    public void add(int index, E element) {//добавляет по индексу,смещая элемент с текущим индексом вправо
        checkPositionIndex(index);
        Node<E> newNode = new Node<>();
        newNode.setElement(element);
        Node<E> currentNode = getNodeByIndex(index);
        if (index == 0) {
            head = newNode;
            newNode.setNextNode(currentNode);
        } else if (index == size) {
            getNodeByIndex(index - 1).setNextNode(newNode);
            tail = newNode;
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
        checkPositionIndex(index);
        return getNodeByIndex(index).getElement();
    }

    @Override
    public E set(int index, E element) {
        checkPositionIndex(index);
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
    public int indexOf(E element) {
        //возвращает индекс первого вхождения
        int index = 0;
        if (element != null) {
            for (Node<E> node = head; node != null; node = node.getNextNode()) {
                if (element.equals(node.getElement())) {
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
            if (head.getNextNode() != null) {
                head = head.getNextNode();
                size--;
                return currentRemovedNode.getElement();
            }
        } else if (index == size - 1) {
            getNodeByIndex(index - 1).setNextNode(null);
            size--;
            return currentRemovedNode.getElement();
        } else if (index >= 0 && index < size) {
            getNodeByIndex(index - 1).setNextNode(currentRemovedNode.getNextNode());
            size--;
            return currentRemovedNode.getElement();
        }
        return null;
    }

    @Override
    public Object[] toArray() {
        Object[] result = new Object[size];
        int i = 0;
        for (Node<E> node = head; node != null; node = node.getNextNode()) {
            result[i++] = node.getElement();
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
                return getNodeByIndex(currentIndex++).getElement();
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
            node = node.getNextNode();
        return node;
    }
}



