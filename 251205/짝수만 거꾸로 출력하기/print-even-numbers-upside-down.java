import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        // 배열 입력
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // 역순으로 짝수만 출력
        for (int j = n - 1; j >= 0; j--) {  // n-1부터 시작
            if (arr[j] % 2 == 0) {
                System.out.print(arr[j] + " ");
            }
        }
    
    }
}