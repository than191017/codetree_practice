import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int sum1 = 0;
        int sum2 = 0;
        int aveNum = 0;
        float ave;
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            if (i % 2 != 0){
                sum1 += arr[i];
            }
            else if (i % 2 == 0 && i >= 2){
                aveNum ++;
                sum2 += arr[i];
            }

        }
        ave = (float) sum2/aveNum; 
        System.out.print(sum1 +" ");
        System.out.printf("%.1f\n", ave);
    }
}
