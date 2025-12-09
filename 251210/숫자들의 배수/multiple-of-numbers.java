import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[100];
        int cnt = 0;

        // 3번째 항부터 10번째 항까지 추가
        for (int i = 0; i < 100; i++) {
            arr[i] =n*(i+1);
            System.out.print(arr[i]+" ");
            if (arr[i] % 5 == 0){
                cnt ++ ;
                if(cnt == 2){
                    break;
                }
            
            }
        }
    }
}
