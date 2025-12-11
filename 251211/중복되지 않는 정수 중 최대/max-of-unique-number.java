import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] cntarr = new int[1000];
        int[] A = new int[n];

        int max = -1;

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            cntarr[arr[i]]++;
        }

        for(int i = 0; i < n; i++){
            if(cntarr[arr[i]]==1){
                A[i] = arr[i];
            }
        }
        for(int i=0; i<n; i++){
            if(max<A[i]){
            max=A[i];
            }
        }
        if(max>0){
            System.out.print(max);
        }
        else{
            System.out.print(-1);


        }
    }
}