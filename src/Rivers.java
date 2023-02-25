import java.util.Scanner;

public class Rivers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int reversA = reverser(a);
        int reversB = reverser(b);

        if (reversA > reversB) {
            System.out.println(b + " < " + a);
        }

        if (reversA < reversB) {
            System.out.println(a + " < " + b);
        }
        if (reversA==reversB){
            System.out.println(a +" = "+ b);
        }

    }


    public static int reverser(int n) {
        int counter = 0;
        int number = n, reverse = 0;
        while (number != 0) {
            counter++;
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        if (counter>3){
            System.out.println(n +" is not true for this exam");
            throw new RuntimeException();
        }

        return reverse;
    }
}
