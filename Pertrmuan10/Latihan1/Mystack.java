package Pertrmuan10.Latihan1;

import Pertrmuan10.Latihan2.AbstractStack;

public class Mystack extends AbstractStack {
    private int[] arr;

    public Mystack(int capacity) {
        super(capacity);
    }
    
    public void displayStack(String s) {
        System.out.println(s);
        System.out.println("Stack (bottom-->):");
        for (int i = 0; i < size(); i++) {
            System.out.println(peekN(i));
            System.out.println(' ');
        }
        System.out.println("");
    }
    
    private int size() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'size'");
    }

    public int peekN(int n) {
        return arr[n];
    }
}
