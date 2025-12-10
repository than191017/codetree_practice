import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. N(원소 개수), Q(질의 개수) 입력
        int N = sc.nextInt();
        int Q = sc.nextInt();

        // 2. 배열 생성 및 데이터 입력
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // 3. 질의(Query) 처리
        for (int k = 0; k < Q; k++) {
            int type = sc.nextInt();

            if (type == 1) {
                // [1 a] : a번째 원소 출력
                int a = sc.nextInt();
                System.out.println(arr[a - 1]);

            } else if (type == 2) {
                // [2 b] : 값 b의 위치 찾기
                int b = sc.nextInt();
                
                // *중요* 찾지 못했을 때를 대비해 기본값을 0으로 설정
                int result = 0; 
                
                for (int i = 0; i < N; i++) {
                    if (arr[i] == b) {
                        result = i + 1; // 찾으면 인덱스+1 저장
                        break;          // 가장 앞의 것을 찾으므로 즉시 종료
                    }
                }
                // 찾았으면 위치값, 못 찾았으면 0이 출력됨
                System.out.println(result);

            } else if (type == 3) {
                // [3 s e] : s번째 ~ e번째 원소 출력
                int s = sc.nextInt();
                int e = sc.nextInt();

                for (int i = s - 1; i < e; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println(); // 줄바꿈
            }
        }
        
        sc.close();
    }
}