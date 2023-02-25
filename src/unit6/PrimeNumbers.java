package unit6;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = a; i <= b; i++) {
            if (is_prime(i)) {
                System.out.println(i);
            }
        }

    }

    public static Boolean is_prime(int number) {
        int counter = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                counter++;
            }
        }
        if (counter == 2) {
            return true;
        }
        return false;
    }
}
