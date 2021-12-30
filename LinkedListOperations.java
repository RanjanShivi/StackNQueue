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
            head = newNode;
            newNode.next = tempNode;
        }
        top = head;
    }

    public void peek(){
        System.out.println("Top element is "+ top.data);
    }

    public void remove() {

        if (top == null)
            System.out.println("Stack Empty");
        else if (head.next == null) {
            System.out.println(head.data + "removed");
            head = null;
        } else {
            while (top != null) {
                Node temp = head;
                System.out.println(temp.data + " Removed...");
                head = head.next;
                temp = temp.next;
                top = head;
            }
        }
    }

    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            top=head;
        } else {
            Node tempNode=tail;
            tail=newNode;
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


