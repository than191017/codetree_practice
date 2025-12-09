import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] countArr = new int[10];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 개수 세기
        for (int i = 0; i < 10; i++) {
            if (n > i){
            countArr[arr[i]]++;
            }
            if(n <= (i+1)){
                for (int j = 1; j < 10; j++) {
                System.out.println(countArr[j]);
                }
                break;
            }
            
        }

        // 개수 출력
    }
}
