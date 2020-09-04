package com.company;

public class MyLinkedList {
    private int size;
    private Node first;
    private Node last;

    MyLinkedList(){

    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    public void add(int value){
        if (this.first == null){
            first = new Node(null, null, value);
        }else{
            Node prevElement = this.last == null ? this.first : this.last;
            this.last = new Node(prevElement, null, value);
            prevElement.next = this.last;
        }
        this.size++;
    }

    public MyLinkedList(Integer... values){
        this.addAll(values);
    }

    public boolean addAll(Integer... values){
        boolean result = values != null && values.length > 0;
        if(result){
            for(Integer value : values){
                add(value);
            }
        }
        return result;
    }

    public void getAll() {
        if (!isEmpty()) {
            for (Node node = this.first; node != null; node = node.next) {
                System.out.println(node.value);
            }
        }
    }
}

class Node{
    Node prev;
    Node next;
    int value;

    Node(Node prev, Node next, int value){
        this.prev = prev;
        this.next = next;
        this.value = value;
    }
}