import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 정수 배열 선언
        int[] arr = new int[10];
        int cnt = 0;
        int sum = 0;


        // 10개의 정수를 배열에 입력받으며 0이 있는지 확인합니다.
        for(int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            sum += (int)arr[i];
            cnt++;
            if(arr[i] == 0)
                break;
        }
        double avg = (double)(sum /(cnt-1));
        System.out.print(sum + " ");
        System.out.printf("%.1f",avg);
    }
}
