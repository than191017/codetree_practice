import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();  // 행
        int M = sc.nextInt();  // 열
        
        int[][] arr = new int[N][M];
        int num = 1;
        
        // 대각선 순회
        // 총 대각선 개수는 N + M - 1개
        for (int diagonal = 0; diagonal < N + M - 1; diagonal++) {
            // 각 대각선의 시작점 결정
            int row, col;
            
            if (diagonal < M) {
                // 첫 번째 행에서 시작
                row = 0;
                col = diagonal;
            } else {
                // 첫 번째 열에서 시작
                row = diagonal - M + 1;
                col = M - 1;
            }
            
            // 대각선을 따라 이동 (오른쪽 위 → 왼쪽 아래)
            while (row < N && col >= 0) {
                arr[row][col] = num++;
                row++;
                col--;
            }
        }
        
        // 출력
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(arr[i][j]);
                if (j < M - 1) System.out.print(" ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}