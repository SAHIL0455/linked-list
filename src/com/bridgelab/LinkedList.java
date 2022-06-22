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
        linkedList.printList();
        linkedList.deleteLast();
        linkedList.printList();
        linkedList.insertElementAtPosition(2,40);
        linkedList.printList();
        linkedList.search(30);
        linkedList.searchAndInsert(40,41);
        linkedList.printList();
        linkedList.searchDelete(40);
        linkedList.printList();
        linkedList.sizeLinkedList();
    }

    MyNode<E> head;
    int size = 0;

    public void addElement(E key) {
        MyNode myNode = new MyNode(key);
        if (head == null) {
            head = myNode;
        } else {
            myNode.next = head;
            head = myNode;
        }
        size++;
    }

    public void addLastElement(E key) {
        MyNode cureentNode = head;
        while (cureentNode.next != null) {
            cureentNode = cureentNode.next;
        }
        MyNode myNode = new MyNode(key);
        cureentNode.next = myNode;
        size++;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("Linklist is Empty ");
        } else {
            size--;
            head = head.next;
        }
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("Linklist is Empty ");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
        } else {
            MyNode secondlast = head;
            MyNode lastNode = head.next;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
                secondlast = secondlast.next;
            }
            secondlast.next = null;
        }
    }

    public void insertElementAtPosition(Integer position, E key) {
        MyNode currentNode = head;
        for (Integer i = 0; i < (position - 1); i++) {
            currentNode = currentNode.next;
        }
        MyNode myNode = new MyNode(key);
        myNode.next = currentNode.next;
        currentNode.next = myNode;
        size++;
    }

    public void search(E key) {
        MyNode cureentNode = head;
        while (cureentNode.key != key) {
            cureentNode = cureentNode.next;
        }
        System.out.println(cureentNode.key + " Element is found in linkedList");
    }

    public void searchAndInsert(E key, E insertElement){
        MyNode cureentNode = head;
        while (cureentNode.key != key) {
            cureentNode = cureentNode.next;
        }
        MyNode myNode = new MyNode(insertElement);
        myNode.next = cureentNode.next;
        cureentNode.next = myNode;
        size++;
    }
    public void searchDelete(E key){
        MyNode secondLastNode = head;
        MyNode lastNode = head.next;
        while (lastNode.key != key){
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }
        secondLastNode.next = lastNode.next;
        size--;
    }

    public void printList() {
        MyNode cureentNode = head;
        while (cureentNode != null) {
            System.out.print(cureentNode.key + " -> ");
            cureentNode = cureentNode.next;
        }
        System.out.println("NUll");
    }
    public void sizeLinkedList(){
        System.out.println(size);
    }
}
