package Pertemuan6.latihan2;

import Pertemuan6.latihan1.StrukturList;

public class StrukturListTest {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();

        // Tambah elemen ke list
        list.addFirst(2);
        list.addFirst(9);
        list.addFirst(7);

        // Tampilkan elemen list
        System.out.println("Elemen list:");
        list.display();

        // Hapus elemen terakhir
        list.removeTail();
        System.out.println("Setelah menghapus elemen terakhir:");
        list.display();

        // Hapus elemen terakhir lagi
        list.removeTail();
        System.out.println("Setelah menghapus elemen terakhir lagi:");
        list.display();

        // Hapus elemen terakhir hingga list kosong
        list.removeTail();
        System.out.println("Setelah menghapus elemen terakhir hingga list kosong:");
        list.display();
    }
}