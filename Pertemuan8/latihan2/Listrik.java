package Pertemuan8.latihan2;

public class Listrik<MataKuliah> {
    Node head;

    class Node {
        MataKuliah data;
        Node next;

        Node(MataKuliah mk) {
            this.data = mk;
            this.next = null;
        }
    }

    void addHead(MataKuliah mk) {
        Node newNode = new Node(mk);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }
}
