import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String next = input.nextLine();
//        List<String> strings = new ArrayList<>(List.of());
        String[] s = next.split(" ");
        int h = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int hr = 0;
        int mr = 0;
        if (h == 0 && m == 0) {
            hr = 0;
            mr = 0;
            System.out.printf("%02d:%02d", hr, mr);
        } else if (0 <= h && h <= 11 && m <= 59 && m >= 0) {
            hr = 12 - h;
            mr = 60 - m;
            System.out.printf("%02d:%02d", hr, mr);
        }


    }
}
