package Pertemuan4.Tugas;

public class StrukturListTest {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();

        // Pengujian untuk hasil a: 2.1 3.4 4.5
        list.addFirst(3.4);
        list.addLast(4.5);
        list.addFirst(2.1);
        list.display();

        // Pengujian untuk hasil b: 3.4 2.1 1.1 4.5 5.5
        StrukturList list2 = new StrukturList();
        list2.addFirst(3.4);
        list2.addLast(4.5);
        list2.addMid(2.1, 1);
        list2.addMid(1.1, 2);
        list2.addLast(5.5);
        list2.display();
    }
}

