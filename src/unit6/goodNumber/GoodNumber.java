package unit6.goodNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodNumber {
    static int goodNumber = 1;

//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        int k = scanner.nextInt();
////
////        while (1 == 1) {
////            int value = num_divs(result);
////            if (value==k){
////                break;
////            }
////            result++;
////        }
//        int counter = 0;
//        int counter2 = 0;
//
////        while (num_divs(counter)!=k){
//        while (num_divs(counter) <= k) {
//            counter++;
//        }
//        counter2 = counter;
//        counter2++;
//
////        if (num_divs(counter2) == num_divs(counter)) {
////            System.out.println(counter2);
////        } else {
////            System.out.println(counter);
////        }
//
//
////        if (num_divs())
//        System.out.println(num_divs(counter));
//        System.out.println(nums(counter));
////        System.out.println(result);
//
//
//    }


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();

        int counter = 1;
        while (num_divs(goodNumber)<k) {
            if (k==1){
                break;
            }
            counter++;
            goodNumber+=counter;
        }
        System.out.println(goodNumber);
        System.out.println(num_divs(goodNumber));
        System.out.println(nums(goodNumber));

    }

    public static int num_divs(int number) {

        int countDivisor = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                countDivisor++;
            }
        }
        return countDivisor;
    }

    public static List<Integer> nums(int number) {
        List<Integer> integers = new ArrayList<>();
        int countDivisor = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                integers.add(i);
            }
        }
        return integers;
    }
}
