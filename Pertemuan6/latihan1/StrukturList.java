package Pertemuan6.latihan1;

public class StrukturList {
    private Node head;

    public void removeTail() {
        if (head != null) {
            if (head.getNext() == null) { // Jika hanya ada satu elemen
                dispose(head);
                head = null;
            } else {
                Node preNode = null;
                Node lastNode = head;

                // Iterasi hingga mencapai elemen terakhir
                while (lastNode.getNext() != null) {
                    preNode = lastNode;
                    lastNode = lastNode.getNext();
                }

                // Hapus elemen terakhir
                preNode.setNext(null);
                dispose(lastNode);
            }
        }
    }

    private void dispose(Node temp) {
        temp.setNext(null);
        temp = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("List kosong");
            return;
        }
        Node curNode = head;
        while (curNode != null) {
            System.out.print(curNode.getData() + " ");
            curNode = curNode.getNext();
        }
        System.out.println();
    }
}