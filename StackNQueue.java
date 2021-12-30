package com;

public class StackNQueue {
    public static void main(String[] args) {
        StackUsingLinkList list = new StackUsingLinkList();

        System.out.println("PUSH");
        list.push(70);
        list.push(30);
        list.push(56);
        list.display();

        System.out.println("PEEK");
        list.peek();

        System.out.println("POP");
        list.pop();
        list.display();

        System.out.println("QUEUE");
        list.queue(70);
        list.queue(30);
        list.queue(56);
        list.display();

    }
}
