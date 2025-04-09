package Pertemuan7.latihan2;

import Pertemuan7.latihan1.StrukturList;

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
        System.out.println("List sebelum penghapusan:");
        list.display(); // Output: 2 6 3 5 1

        // 4. Hapus elemen 3 di tengah list
        list.removeMid(3);

        // 5. Tampilkan elemen list
        System.out.println("List setelah penghapusan elemen 3:");
        list.display(); // Output: 2 6 5 1

        // Tambahkan instruksi untuk menghapus elemen list di tengah
        list.removeMid(6);
        list.removeMid(5);

        // Tampilkan elemen list setelah penghapusan tambahan
        System.out.println("List setelah penghapusan elemen tambahan:");
        list.display(); // Output: 2 1
    }
}