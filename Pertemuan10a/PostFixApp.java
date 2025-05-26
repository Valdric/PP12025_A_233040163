package Pertemuan10a;

import java.util.Scanner;

public class PostFixApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan ekspresi postfix: ");
        String input = scanner.nextLine();

        ParsePost parser = new ParsePost(input);
        int hasil = parser.doParse();

        System.out.println("Hasil: " + hasil);
    }
}
