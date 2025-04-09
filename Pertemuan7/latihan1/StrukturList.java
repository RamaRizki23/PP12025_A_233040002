package Pertemuan7.latihan1;

public class StrukturList {
    private Node head;

    public boolean isEmpty() {
        return head == null;
    }

    public void removeMid(int e) {
        if (isEmpty()) {
            System.out.println("Elemen list kosong");
            return;
        }

        Node preNode = null;
        Node tempNode = head;
        boolean ketemu = false;

        while (tempNode != null && !ketemu) {
            if (tempNode.getData() == e) {
                ketemu = true;
            } else {
                preNode = tempNode;
                tempNode = tempNode.getNext();
            }
        }

        if (ketemu) {
            if (preNode == null) {
                // Elemen yang dihapus adalah head
                head = tempNode.getNext();
            } else {
                // Elemen yang dihapus ada di tengah
                preNode.setNext(tempNode.getNext());
            }
            System.out.println("Elemen " + e + " berhasil dihapus");
        } else {
            System.out.println("Elemen " + e + " tidak ditemukan");
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.setNext(head);
        head = newNode;
    }
}

class Node {
    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

//public class Main {
    //public static void main(String[] args) {
        //StrukturList list = new StrukturList();
        //list.addFirst(5);
        //list.addFirst(3);
        //list.addFirst(7);

        //System.out.println("List sebelum penghapusan:");
        //list.display();

       // list.removeMid(3);

     //   System.out.println("List setelah penghapusan elemen 3:");
       // list.display();
   // }
//}