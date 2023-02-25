package unit5;

import java.util.Scanner;

public class YelloQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (!(n >= 1 && n <= 1000)) return;
        System.out.print("W");
        for (int i = 0; i < n; i++) {
            System.out.print("o");
        }
        System.out.print("w!");
    }
}
