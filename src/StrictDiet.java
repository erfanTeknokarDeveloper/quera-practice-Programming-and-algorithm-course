import java.util.Scanner;

public class StrictDiet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int r = 0;
        int y = 0;
        int g = 0;


        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i) == 'R' || input.charAt(i) == 'r') {
                r++;
            }
            if (input.charAt(i) == 'Y' || input.charAt(i) == 'y') {
                y++;
            }
            if (input.charAt(i) == 'G' || input.charAt(i) == 'g') {
                g++;
            }
        }

        if ((r >= 3) || (y >= 2 && r >= 2) || g == 0) {
            System.out.println("nakhor lite");
        }else {
            System.out.println("rahat baash");
        }

    }
}
