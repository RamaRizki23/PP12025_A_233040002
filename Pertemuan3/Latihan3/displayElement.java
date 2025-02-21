package Pertemuan3.Latihan3;

import Pertemuan3.Latihan2.StrukturList;
import Pertemuan3.Latihan1.Node;

public class displayElement {
    private static final Node Head = null;
    
        public void displayElement() {
            Node curNode = Head;
        while (curNode !=null) {
            System.out.print(curNode.getData()+ " ");
            curNode = curNode.getNext();
        }
    }
}