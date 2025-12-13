import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        int max5 = 0;      // 500 미만 최댓값
        int min5 = 1001;   // 500 초과 최솟값 (충분히 큰 값으로 초기화)

        for (int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
            
            // 500 미만 중 최댓값
            if (arr[i] < 500 && arr[i] > max5){
                max5 = arr[i];
            }
            
            // 500 초과 중 최솟값
            if (arr[i] > 500 && arr[i] < min5){
                min5 = arr[i];
            }
        }

        System.out.print(max5 + " " + min5);
    }
}