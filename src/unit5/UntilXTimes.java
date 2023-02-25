package unit5;

import java.util.Scanner;

public class UntilXTimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        while (number != 0) {

            for (int i = 0; i < number; i++) {
                System.out.println(number);
            }
            number = scanner.nextInt();
        }
    }
}
