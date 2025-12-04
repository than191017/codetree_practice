import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < 100; i++) {
            if (n <= 100){
            System.out.print(n+" ");
            n++;
            }
        }
    }
}
