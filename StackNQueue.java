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

    }
}
