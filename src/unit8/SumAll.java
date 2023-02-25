package unit8;

import java.util.Scanner;

public class SumAll {
    public static void main(String[] args) {
        int[] array = new int[12];
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);
    }
}
