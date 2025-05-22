package Pertemuan9.Latihan1;

public class StrukturStack {
    private int[] array;
    private int capacity;
    private int top;

    public StrukturStack(int capacity) {
        this.capacity = capacity;
        this.array = new int[capacity];
        this.top = -1;
    }

    // Operasi Push
    public void push(int data) {
        if (top < capacity - 1) {
            top++;
            array[top] = data;
            System.out.println("Push: " + data);
        } else {
            System.out.println("Stack penuh. Push gagal: " + data);
        }
    }
}

