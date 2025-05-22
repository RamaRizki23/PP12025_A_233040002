package Pertrmuan10.Latihan3;

import java.util.Scanner;

public class PostFixApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan ekspresi postfix: ");
        String input = scanner.nextLine();
        ParsePost parser = new ParsePost(input);
        int result = parser.doParse();
        System.out.println("Hasil: " + result);
    }
}