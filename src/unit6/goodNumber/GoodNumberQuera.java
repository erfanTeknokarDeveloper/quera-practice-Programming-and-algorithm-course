package unit6.goodNumber;

import java.util.Scanner;

public class GoodNumberQuera {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int number = 0;
        int sum = 0;
        while (div_nums(sum) < k) {
            number += 1;
            sum += number;
        }
        System.out.println(sum);
    }

    private static int div_nums(int num) {
        int cnt = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                cnt++;
        }
        return cnt;
    }
}

