package com.task3.linkedlist;

/**
 * Created by admin on 07.03.2017.
 */
public class LinkedList {
    private Node head;
    private Node tail;

    public LinkedList() {
    }

    public void add(Integer data) {
        Node node = new Node();
        node.setData(data);
        if(tail == null)
        {
            head = node;
            tail = node;
        }
        else {
            tail.setNext(node);
            tail = node;
        }

    }

    public Integer get(int index) {
        if (index<0 || index>size()-1){
            return null;
        }
        return gotoNode(index).getData();
    }

    public Node gotoNode(int index)
    {
        Node node = head;
        int i=0;
        while (i<index)
        {
            i++;
            node = node.getNext();
        }
        return node;
    }


    public boolean delete(int index) {
        if (index<0 || index>size()){
            return false;
        }
        if (index == 0)
        {
            head = gotoNode(index + 1);
        }
        else if (index == size())
        {
            gotoNode(index - 1).setNext(null);
        }
        else {
            Node node = gotoNode(index - 1);
            node.setNext(gotoNode(index + 1));
        }
        return true;

    }

    public int size() {
        Node node = head;
        int i=0;
        while (node != null)
        {
            i++;
            node = node.getNext();
        }
        return i;
    }

    void printList()
    {
        Node t = head;
        while (t != null)
        {
            System.out.print(t.getData() + " ");
            t = t.getNext();
        }
    }

    public static void main(String[] args) {
        LinkedList li = new LinkedList();
        li.add(99);
        li.add(-12);
        li.add(13);
        li.add(14);
        li.add(15);
        li.delete(2);
        li.printList();
        System.out.println(li.get(0));
    }
}

