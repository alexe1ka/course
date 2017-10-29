package com.company.mylist;

public class NodeOld<E> {
    private E element;
    private NodeOld<E> nextNode;


    //НЕ ИСПОЛЬЗУЕТСЯ
    public NodeOld() {
    }

    public NodeOld(E element) {
        this.element = element;
    }

    public NodeOld(E element, NodeOld<E> nextNode) {
        this.element = element;
        this.nextNode = nextNode;
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public NodeOld<E> getNextNode() {
        return nextNode;
    }

    public void setNextNode(NodeOld<E> nextNode) {
        this.nextNode = nextNode;
    }
}
