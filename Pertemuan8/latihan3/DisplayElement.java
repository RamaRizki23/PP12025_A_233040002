package Pertemuan8.latihan3;

public class DisplayElement {

    private Node head; // Define the head variable

    void displayElement() {
        Node current = head;
        while (current != null) {
            current.data.display();
            current = current.next;
        }
    }

    // Inner Node class definition
    private class Node {
        Element data; // Assuming Element is a class with a display() method
        Node next;
    }
}

// Assuming Element class exists
class Element {
    void display() {
        // Implementation of display method
        System.out.println("Displaying element");
    }
}