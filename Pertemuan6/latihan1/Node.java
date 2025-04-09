package Pertemuan6.latihan1;

public class Node {
    private double data;
    private Node next;

    public Node(double data) {
        this.data = data;
    }

    public double getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}