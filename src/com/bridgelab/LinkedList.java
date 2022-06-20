package com.bridgelab;

public class LinkedList {
    public static void main(String[] args) {
        System.out.println("Welcome to Linked List Problems");
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);
    }
}
