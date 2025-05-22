package Pertemuan9.latihan2;

public class StrukturStack {
    // Atribut internal stack
    private int[] array;     // array untuk menyimpan elemen-elemen stack
    private int capacity;    // kapasitas maksimum stack
    private int top;         // penunjuk elemen teratas stack

    // Konstruktor dengan parameter kapasitas
    public StrukturStack(int capacity) {
        this.capacity = capacity;
        this.array = new int[capacity]; // inisialisasi array stack
        this.top = -1; // inisialisasi top ke -1 (stack kosong)
    }

    public void push(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'push'");
    }

    public String size() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'size'");
    }

    public void pop() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pop'");
    }

    public String top() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'top'");
    }

    public String isFull() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isFull'");
    }

    public String isEmpty() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
    }

}

