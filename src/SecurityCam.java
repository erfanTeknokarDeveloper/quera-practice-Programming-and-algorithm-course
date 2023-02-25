import java.util.Scanner;

public class SecurityCam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x0 = scanner.nextInt(), y0 = scanner.nextInt();
        int x1 = scanner.nextInt(), y1 = scanner.nextInt();
        int x2 = scanner.nextInt(), y2 = scanner.nextInt();
        int x3 = 0, y3 = 0;

        if (x0 == x1) {
            x3 = x2;
        } else if (x0 == x2) {
            x3 = x1;
        } else if (x1 == x2) {
            x3 = x0;
        }

        if (y0 == y1) {
            y3 = y2;
        } else if (y0 == y2) {
            y3 = y1;
        } else if (y1 == y2) {
            y3 = y0;
        }

        System.out.println(x3 + " " + y3);

    }
}
