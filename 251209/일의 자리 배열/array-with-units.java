import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        System.out.print(arr[0] + " ");
        System.out.print(arr[1] + " ");

        for (int i = 2; i < 10; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
            if (arr[i] >= 10){
                arr[i] -= 10;
                System.out.print(arr[i] + " ");
            }
            else if (arr[i] < 10){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
