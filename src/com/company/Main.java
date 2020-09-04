package com.company;

public class Main {

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        System.out.println(list.isEmpty());
        list.addAll(2,4,6,7,123,14342,12313,31,12,2,3,45,565,6,7);
        System.out.println(list.getSize());
        System.out.println(list.isEmpty());
        list.getAll();
    }
}
