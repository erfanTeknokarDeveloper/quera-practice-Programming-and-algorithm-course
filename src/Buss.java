import java.util.Scanner;

public class Buss {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        int x2 = input.nextInt();
        int y2 = input.nextInt();
//        int x1 = input.nextInt(), y1 = input.nextInt(), x2 = input.nextInt(), y2 = input.nextInt();

        if (x1 == x2) {
            System.out.println("Vertical");
        } else if (y1 == y2) {
            System.out.println("Horizontal");
        } else {
            System.out.println("Try again");
        }
    }
}
