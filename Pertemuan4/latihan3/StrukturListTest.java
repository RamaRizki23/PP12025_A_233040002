package Pertemuan4.latihan3;

import Pertemuan4.latihan2.StrukturList;

public class StrukturListTest {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();

        list.addLast(3);
        list.addLast(4);
        list.addMid(7, 2);
        list.addMid(8, 2);
        list.addFirst(5);
        list.display();
    }
}
