import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int[] arr = new int[100];

        n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 0){
                sum = arr[i-1] + arr[i-2] + arr[i-3]
                System.out.println(arr[i-1]);
                System.out.println(arr[i-1]);
            }
        }

        System.out.println(sum);
    }
}
