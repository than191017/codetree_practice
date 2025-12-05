import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] arr = new double[8];
        double sum = 0;
        double avg = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextDouble();
            sum += arr[i];
        }

        avg = sum/arr.length;

        System.out.printf("%.1f",avg);
    }
}
