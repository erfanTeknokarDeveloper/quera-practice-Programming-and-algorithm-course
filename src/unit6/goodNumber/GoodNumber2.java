package unit6.goodNumber;

import java.util.Scanner;

public class GoodNumber2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int j = 0, goodNumber = 0;
        while (true) {
            j++;
            goodNumber = (j * (j + 1) / 2);

            if (numDivs(goodNumber) >= k) break;

        }
        System.out.print(goodNumber);

    }

    static int numDivs(int goodNumber) {
        int n = 0;
        for (int i = 1; i <= goodNumber; i++) {
            if (goodNumber % i == 0)
                n++;
        }
        return n;

    }

}

