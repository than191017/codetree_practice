import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int min = 100;
        int minus = 0;

        // 모든 (사는 날, 파는 날) 조합 확인
        for (int i = 0; i < n ; i++){      // 사는 날
            for (int j = 1; j < n; j++){  // 파는 날 (사는 날 이후)
                if ((arr[j] - arr[i])>0){
                    minus = arr[j] - arr[i];
                }
                else if ((arr[j] - arr[i])<0)
                    minus = arr[i] - arr[j];
                
                if (min > minus){
                    min = minus;
                }
            }
        }

        System.out.print(min);
    }
}