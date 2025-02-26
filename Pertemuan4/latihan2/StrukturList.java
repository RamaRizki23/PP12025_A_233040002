package Pertemuan4.latihan2;

import Pertemuan4.latihan1.Node;

public class StrukturList {
    private Node HEAD;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.setNext(HEAD);
        HEAD = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (HEAD == null) {
            HEAD = newNode;
        } else {
            Node curNode = HEAD;
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
            }
            curNode.setNext(newNode);
        }
    }

    public void addMid(int data, int position) {
        if (position <= 1 || HEAD == null) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node curNode = HEAD;
        for (int i = 1; i < position - 1 && curNode.getNext() != null; i++) {
            curNode = curNode.getNext();
        }
        newNode.setNext(curNode.getNext());
        curNode.setNext(newNode);
    }

    public void display() {
        Node curNode = HEAD;
        while (curNode != null) {
            System.out.print(curNode.getData() + " -> ");
            curNode = curNode.getNext();
        }
        System.out.println("null");
    }
}
