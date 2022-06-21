package com.bridgelab;

public class MyNode <T>{
     T key;
     MyNode next;

     public MyNode(T key) {
          this.key = key;
          this.next = null;
     }
}
