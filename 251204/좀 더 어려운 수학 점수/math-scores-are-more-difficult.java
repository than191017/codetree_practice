import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if ( (b > a) ) {
            System.out.println("B");
        }
        else if ((a == b) && (d > c)) {
            System.out.println("B");
        }
        else if ((a == b) && (d <= c)) { 
            System.out.println("A");
        }
        else {
            System.out.println("A");
        }
    }
}
