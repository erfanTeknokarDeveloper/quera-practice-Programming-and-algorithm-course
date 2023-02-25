package unit5;

import java.util.Scanner;

public class InputLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int number = 0;
        while (count < 100) {
            int input = scanner.nextInt();
            if (input == 0) break;
            if (!(input<1000)) return;
            number += input;
            count++;
        }
        System.out.println(number);

    }
}
