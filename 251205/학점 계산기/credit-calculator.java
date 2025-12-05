import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float sum = 0.0f;
        float [] arr = new float[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextFloat();
            sum += arr[i];
        }

        double avg = (double)sum/n;
        System.out.printf("%.1f\n",avg);

        if(avg >=4.0){
            System.out.print("Perfect");
        }
        else if (avg >=3.0){
            System.out.print("Good");
        } 
        else {
            System.out.print("Poor");
        }
    }
}
