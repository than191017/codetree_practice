import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] countArr = new int[10];

        // 입력 받기
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 개수 세기
        for (int i = 0; i < n; i++) {
            countArr[arr[i]]++;
        }

        // 개수 출력 (1부터 9까지)
        for (int i = 1; i < 10; i++) {
            System.out.println(countArr[i]);
        }
    }
}