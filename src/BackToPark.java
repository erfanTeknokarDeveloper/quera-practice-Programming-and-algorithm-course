import java.util.Scanner;

public class BackToPark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x0 = scanner.nextInt(), y0 = scanner.nextInt();
        int x1 = scanner.nextInt(), y1 = scanner.nextInt();

//        if (x1 > x0 && y1>0 && y0>0){
//            System.out.println("right");
//        } else if (x1 < x0 && y1 > 0 && y0 > 0) {
//            System.out.println("left");
//        } else if (x1 > x0 && y1 < 0 && y0 < 0) {
//
//        }

        if (x1 > x0) {
            System.out.println("right");
        } else if (x1 < x0) {
            System.out.println("left");
        }


    }
}
