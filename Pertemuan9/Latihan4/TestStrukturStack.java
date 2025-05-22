package Pertemuan9.Latihan4;

public class TestStrukturStack {
    public static void main(String[] args) {
        // Membuat stack dengan kapasitas 3 elemen
        StrukturStack stack = new StrukturStack(3);
        
        // Sebelum push
        System.out.println("#sebelum push");
        System.out.println("Size: " + stack.size());
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("Top: " + stack.top());
        System.out.print("Elemen from TOP: ");
        stack.displayElements();
        System.out.println();
        
        // Melakukan push 3x
        System.out.println("#melakukan push 3x:");
        System.out.println("push 2; push 4, push 1");
        stack.push(2);
        stack.push(4);
        stack.push(1);
        
        // Setelah push
        System.out.println("Size: " + stack.size());
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("Top: " + stack.top());
        System.out.print("Elemen from TOP: ");
        stack.displayElements();
    }
}

class StrukturStack {
    private int[] array;
    private int capacity;
    private int TOP;
    public final int MIN = -1;
    
    public StrukturStack(int capacity) {
        super();
        this.array = new int[capacity];
        this.capacity = capacity;
        this.TOP = MIN;
    }
    
    public boolean isEmpty() {
        return (TOP == MIN);
    }
    
    public boolean isFull() {
        return (TOP == capacity - 1);
    }
    
    public int size() {
        return TOP + 1;
    }
    
    public int top() {
        if (isEmpty()) {
            return MIN;
        } else {
            return array[TOP];
        }
    }
    
    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack penuh");
        } else {
            TOP++;
            array[TOP] = data;
        }
    }
    
    // Method untuk menampilkan elemen dari TOP
    public void displayElements() {
        if (isEmpty()) {
            System.out.println("Stack kosong");
        } else {
            for (int i = TOP; i >= 0; i--) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }
}