package Pertemuan3.Latihan2;

import Pertemuan3.Latihan1.Node;

public class StrukturList {
    private Node Head;

    public void addTail(int data) {
        Node posNode = null, curNode = null;
        Node newNode = new Node(data);

        if (isEmpty()) {
            Head = newNode;
        } else {
            curNode = Head;
            while (curNode != null) {
                posNode = curNode;
                curNode = curNode.getNext();
            }
            posNode.setNext(newNode);
        }
    }

    public boolean isEmpty() {
        return Head == null;
    }

    public void displayElement() {
        Node curNode = Head;
        while (curNode != null) {
            System.out.print(curNode.getData() + " ");
            curNode = curNode.getNext();
        }
        System.out.println();
    }
}