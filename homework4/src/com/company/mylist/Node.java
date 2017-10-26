package com.company.mylist;

public class Node<E> {
    private E element;
    private Node<E> nextNode;

    public Node() {
    }

    public Node(E element) {
        this.element = element;
    }

    public Node(E element, Node<E> nextNode) {
        this.element = element;
        this.nextNode = nextNode;
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public Node<E> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<E> nextNode) {
        this.nextNode = nextNode;
    }
}
