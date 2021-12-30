package com;

public class StackUsingLinkList {
    LinkedListOperations list = new LinkedListOperations();

    public void push(int data) {
        list.add(data);
    }

    public void peek(){
        list.peek();
    }

    public void pop(){
        list.remove();
    }

    public void queue(int data){
        list.append(data);
    }
    public void display(){
        list.print();
    }
}

