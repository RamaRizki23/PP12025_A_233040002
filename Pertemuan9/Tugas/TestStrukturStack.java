package Pertemuan9.Tugas;

public class TestStrukturStack {
    public static void main(String[] args) {
        StrukturStack stack = new StrukturStack(3);

        // Push 3 elemen
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40); // Gagal (stack penuh)

        // Cek atribut setelah push
        System.out.println("Top: " + stack.top());
        System.out.println("Size: " + stack.size());
        System.out.println("isFull: " + stack.isFull());
        System.out.println("isEmpty: " + stack.isEmpty());

        // Pop semua elemen
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop(); // Gagal (stack kosong)

        // Cek atribut setelah pop
        System.out.println("Top setelah pop: " + stack.top());
        System.out.println("Size setelah pop: " + stack.size());
        System.out.println("isFull: " + stack.isFull());
        System.out.println("isEmpty: " + stack.isEmpty());
    }
}