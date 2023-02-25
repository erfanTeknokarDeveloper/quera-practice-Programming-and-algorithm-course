package unit5;

import java.util.Scanner;

public class WriteOpposite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = 0;

        while (n > 0) {
            m = m * 10 + n % 10;
            n = n / 10;
        }
        System.out.println(m);
    }
}
