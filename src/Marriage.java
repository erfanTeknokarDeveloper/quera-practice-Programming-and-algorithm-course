import java.util.Scanner;

public class Marriage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a%2==0 || (b%2==0 && c%2==0)){
            System.out.println("good");
        }
        else {
            System.out.println("bad");
        }
    }
}
