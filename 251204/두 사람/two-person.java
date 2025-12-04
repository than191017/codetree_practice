import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String s1 = sc.next();

        int b = sc.nextInt();
        String s2 = sc.next();

        if (((a >= 19) && (s1.equals("M"))) || ((b >= 19) && (s2.equals("M")))) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }
}
