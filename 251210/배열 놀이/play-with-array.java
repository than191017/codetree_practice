import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 
        int q = sc.nextInt();

        int[] arr = new int[n];
        int cnt2 = 0;

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
       }

       for(int i=0; i<q;i++){
            int start = sc.nextInt();

            if(start == 1){
                int a = sc.nextInt();
                System.out.println(arr[a-1]);
                // break;
            }
            else if (start == 2){
                int b = sc.nextInt();
                
                for(int j = 0; j<n; j++){
                    if(arr[j]== b){
                        System.out.println((j+1));
                        cnt2 += 1;
                        break;
                    }
                }
                if(cnt2 == n){
                    System.out.println(0+" ");
                }


            }
            else if(start == 3){
                int s = sc.nextInt();
                int e = sc.nextInt();

                for(int k = s-1; k<e; k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }

       }

    }
}
