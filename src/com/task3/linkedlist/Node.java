package com.task3.linkedlist;

/**
 * Created by admin on 07.03.2017.
 */
class Node{
    private Node next;
    private Integer data;

    public Node() {
    }

    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }
    public Integer getData() {
        return data;
    }
    public void setData(Integer data) {
        this.data = data;
    }
}
