import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        // 배열 입력받기
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // 1번째와 2번째 최댓값 초기화
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        
        // 배열을 순회하며 최댓값 갱신
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                // 새로운 최댓값 발견
                secondMax = max;  // 기존 max를 secondMax로
                max = arr[i];      // 새로운 값을 max로
            } else if (arr[i] > secondMax && arr[i] < max) {
                // max보다 작지만 secondMax보다 큰 경우
                secondMax = arr[i];
            }
        }
        
        System.out.println(max + " " + secondMax);
    }
}