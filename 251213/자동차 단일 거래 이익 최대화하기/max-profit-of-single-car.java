import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        int max = 0;      // 500 미만 최댓값
        int min = Integer.MAX_VALUE;
        int cnt = 0;

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            if (min > arr[i] ){
                min = arr[i];
                cnt = i;
            }
        }

        for (int i = cnt; i < n; i++){
            if (min < arr[i]){
                max = arr[i];
            }
        }

        if ((max-min) > 0){
            System.out.print((max-min));
        }
        else {
            System.out.print(0);
        }
    }
}