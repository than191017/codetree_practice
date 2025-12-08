import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int sum1 = 0;
        int sum2 = 0;
        int cnt = 0;
        float ave;
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 1; i <= 10; i += 2) {
            sum1 += arr[i];
        }
        // 3의 배수 번째로 입력된 값의 합
        for (int i = 2; i < 10; i += 3) {
            sum2 += arr[i];
            cnt ++;
        }
        double avg2 = (double) sum2 / cnt;
        System.out.printf("%d %.1f", sum1, avg2);
    }
}
