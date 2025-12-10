import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;

        int[] arr = new int[b];

        while (a > 0) {
            int remainder = a % b;
            arr[remainder]++;
            a = a / b;
        }

        for (int j = 0; j < b; j++) {
            sum += arr[j] * arr[j];
        }

        System.out.println(sum);
    }
}