import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();

       int[] arr1 = new int[a];
       int[] arr2 = new int[b];

       int cnt = 0;

       for (int i = 0; i < a; i++){
        arr1[i] = sc.nextInt();
       }

       for (int i = 0; i < b; i++){
        arr2[i] = sc.nextInt();
       }

       for (int i = 0; i < a; i++){
        if(arr1[i] == arr2[0] && (i + b) <= a){
            for(int j = 0; j < b ; j++){
                if(arr1[i+j] == arr2[j]){
                    cnt++;
                }
            }
            if (cnt == b){
                System.out.print("Yes");
                break;
            }
            else{
                cnt = 0;
            }

           if(cnt == 0){
            System.out.print("No");
            }
        }
       }

    }
}

