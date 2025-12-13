import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int maxProfit = 0;

        // 모든 (사는 날, 파는 날) 조합 확인
        for (int i = 0; i < n - 1; i++){      // 사는 날
            for (int j = i + 1; j < n; j++){  // 파는 날 (사는 날 이후)
                int profit = arr[j] - arr[i];
                if (profit > maxProfit){
                    maxProfit = profit;
                }
            }
        }

        System.out.print(maxProfit);
    }
}