package Pertemuan9.Tugas;

public class StrukturStack {
    // Atribut internal stack
    private int[] array;
    private int capacity;
    private int top;

    // Konstruktor
    public StrukturStack(int capacity) {
        this.capacity = capacity;
        this.array = new int[capacity];
        this.top = -1;
    }

    // Latihan 1: operasi push
    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack penuh. Push gagal: " + data);
            return;
        }
        array[++top] = data;
        System.out.println("Push: " + data);
    }

    // Tugas: operasi pop
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong. Pop gagal.");
            return -1;
        }
        int data = array[top];
        top--;
        System.out.println("Pop: " + data);
        return data;
    }

    // Latihan 3: cek apakah stack kosong
    public boolean isEmpty() {
        return top == -1;
    }

    // Latihan 3: cek apakah stack penuh
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Latihan 3: ukuran stack
    public int size() {
        return top + 1;
    }

    // Latihan 3: ambil elemen paling atas
    public int top() {
        if (!isEmpty()) {
            return array[top];
        } else {
            System.out.println("Stack kosong. Tidak ada elemen di top.");
            return -1;
        }
    }
}

