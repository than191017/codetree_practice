import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] cntarr = new int[1001];  // 1000 → 1001로 변경 (0~1000 인덱스 사용)
        
        int max = -1;

        // 배열 입력 및 빈도수 카운트
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            cntarr[arr[i]]++;
        }

        // 중복되지 않은 원소 중 최댓값 찾기
        for(int i = 0; i < n; i++){
            if(cntarr[arr[i]] == 1){  // 중복되지 않은 원소
                if(arr[i] > max){
                    max = arr[i];
                }
            }
        }
        
        System.out.print(max);
    }
}