import java.util.Scanner;

public class Maximum4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int maximum = a;


        if (b > maximum) {
            maximum = b;
        }
        if (c > maximum) {
            maximum = c;
        }
        if (d > maximum) {
            maximum = d;
        }


//        if (a > b && a > c && a > d) {
//            maximum = a;
//        } else if (b > a && b > c && b > d) {
//            maximum = b;
//        } else if (c > a && c > b && c > d) {
//            maximum = c;
//        } else if (d > a && d > b && d > c) {
//            maximum = d;
//        }

        System.out.println(maximum);
    }
}
