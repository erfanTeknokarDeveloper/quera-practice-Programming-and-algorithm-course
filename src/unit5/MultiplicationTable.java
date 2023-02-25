package unit5;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (!(number>=1 && number<=100)) return;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }

    }
}
