package com.bridgelab;

public class LinkedList<E> {
    public static void main(String[] args) {
        System.out.println("Welcome to Linked List Problems");
        LinkedList linkedList = new LinkedList();
        linkedList.addElement(70);
        linkedList.addElement(30);
        linkedList.addElement(56);
        linkedList.printList();
        linkedList.addLastElement(52);
        linkedList.addLastElement(53);
        linkedList.printList();
        linkedList.deleteFirst();
        linkedList.printList();
    }

    MyNode<E> head;

    public void addElement(E key) {
        MyNode myNode = new MyNode(key);
        if (head == null) {
            head = myNode;
        } else {
            myNode.next = head;
            head = myNode;
        }
    }

    public void addLastElement(E key) {
        MyNode cureentNode = head;
        while (cureentNode.next != null) {
            cureentNode = cureentNode.next;
        }
        MyNode myNode = new MyNode(key);
        cureentNode.next = myNode;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("Linklist is Empty ");
        } else {
            head = head.next;
        }
    }

    public void printList() {
        MyNode cureentNode = head;
        while (cureentNode != null) {
            System.out.print(cureentNode.key + " -> ");
            cureentNode = cureentNode.next;
        }
        System.out.println("NUll");
    }
}
