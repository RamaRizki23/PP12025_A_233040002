package Pertemuan4.latihan1;

public class Node {
    private int data;
    private Node next;
    public String nama;

    public Node(int data) {
        this.data = data;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
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