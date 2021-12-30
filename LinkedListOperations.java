package com;

public class LinkedListOperations {
    Node head;
    Node tail;
    Node top;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node tempNode = head;
            this.head = newNode;
            newNode.next = tempNode;
        }
        top=head;
    }

    public void peek(){
        System.out.println("Top element is "+this.top.data);
    }

    public void remove() {
        Node temp =top;
        while (temp != null){
            Node tempNode = this.head;
            this.head = tempNode.next;
            temp=temp.next;
        }
    }

    public void append(int data) {
        Node newNode=new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            top=head;
        } else {
            Node tempNode=tail;
            this.tail=newNode;
            tempNode.next=tail;
        }
    }

    public void print(){
        if (head == null) {
            System.out.println("Stack is Empty");
            return;
        }
        else {
            Node tempNode = head;

            while (tempNode != null) {
                System.out.print(tempNode.data + " ");
                tempNode = tempNode.next;
            }
        }
    }
}


