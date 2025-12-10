import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int tmp = 0;
        int sum = 0;

        int[] arr = new int[b];  // b 크기로 충분합니다 (나머지는 0~b-1)

        while (a >= 1) {  // a가 1 미만이 될 때까지
            tmp = a % b;      // 먼저 나머지 구하기
            arr[tmp] += 1;    // 나머지 카운트
            a = a / b;        // 그 다음 몫 구하기
        }

        for (int j = 0; j < b; j++) {
            sum += arr[j] * arr[j];
        }

        System.out.println(sum);

    }
}