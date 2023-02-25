import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String next = input.nextLine();
//        List<String> strings = new ArrayList<>(List.of());
        String[] s = next.split(" ");
        int h = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        if (h<=11 && h>=0){
            h+=6;
        }
        if (m>=0 &&m<=59){
            m+=30;
        }



        System.out.println(h+":"+m);
    }
}
