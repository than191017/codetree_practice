import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        int max5 = 0;
        int min5 = 0;
        int totalMax = 0;

        for (int i = 0 ; i < 10 ; i++){
            arr[i] = sc.nextInt();
            if (arr[i] > max5 && arr[i] < 500){
                max5 = arr[i];
            }
            if (arr[i] > 500 & arr[i] > totalMax){
                totalMax = arr[i];
            }
        }

        for (int i = 0 ; i < 10 ; i++){
            if (arr[i] > 500 && arr[i] < totalMax){
                min5 = arr[i];
            }
        }



        System.out.print( max5 + " " + min5);


    }
}