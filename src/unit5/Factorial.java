package unit5;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int factorial = scanner.nextInt();

        int result = 1;

        if (!(factorial > 0 && factorial < 11)) return;
        for (int i = factorial; i > 0; i--) {
            result *= i;
        }
        System.out.println(result);
    }
}
