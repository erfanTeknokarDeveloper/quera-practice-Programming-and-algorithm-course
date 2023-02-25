package unit5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PoppySleep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int counter = 0;

        if (!(a >= 1 && a <= 1000)) return;
        if (!(b >= 1 && b <= 1000)) return;
        if (!(c >= 2 && c <= 1000)) return;

        List<Integer> msa = new ArrayList<>();
        List<Integer> msb = new ArrayList<>();

        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                msa.add(i);
            }
        }

        for (int i = 1; i <= b; i++) {
            if (b % i == 0) {
                msb.add(i);
            }
        }

        for (int i = 0; i < msa.size(); i++) {
            for (int j = 0; j < msb.size(); j++) {
                if (msa.get(i) + msb.get(j) <= c) {
                    counter++;
                    System.out.println("(" + msa.get(i) + "," + msb.get(j) + ")");
                }


            }
        }

        System.out.println(msa);
        System.out.println(msb);
        System.out.println(counter);

    }
}
