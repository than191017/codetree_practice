import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int secondmax ;
        int minVal = Integer.MAX_VALUE;
        
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            secondmax = arr[i];

            if (arr[i] < minVal){
                minVal = arr[i];
            }

            if (i >= 1 && secondmax > arr[i-1] && secondmax >= minVal ){
                secondmax = arr[i-1];
            }



        }
    
        System.out.println(minVal + " " + secondmax);
    }
}

