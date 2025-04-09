package Pertemuan6.latihan4;

import Pertemuan6.latihan3.StrukturList;

public class StrukturListTest {
    public static void main(String[] args) {
        // 1. Create list dengan keyword new
        StrukturList list = new StrukturList();

        // 2. Tambah elemen sehingga elemen list berisi (2, 6, 3, 5, 1)
        list.addFirst(1);
        list.addFirst(5);
        list.addFirst(3);
        list.addFirst(6);
        list.addFirst(2);

        // 3. Tampilkan elemen list
        System.out.println("Elemen list:");
        list.display(); // Output: 2 6 3 5 1

        // 4. Hapus elemen di akhir list
        list.removeTail();

        // 5. Tampilkan elemen list
        System.out.println("Setelah menghapus elemen terakhir:");
        list.display(); // Output: 2 6 3 5

        // 6. Hapus elemen di awal list
        list.removeHead();

        // 7. Tampilkan elemen list
        System.out.println("Setelah menghapus elemen pertama:");
        list.display(); // Output: 6 3 5

        // Tambahkan lagi instruksi untuk menghapus elemen di akhir
        list.removeTail();
        System.out.println("Setelah menghapus elemen terakhir lagi:");
        list.display(); // Output: 6 3
    }
}