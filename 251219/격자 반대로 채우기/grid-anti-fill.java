import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[][] grid = new int[n][n];
        int num = 1;
        
        // 열을 오른쪽에서 왼쪽으로 순회
        for (int col = n - 1; col >= 0; col--) {
            // 오른쪽에서부터 짝수번째 열(0-based로 홀수 인덱스)은 아래에서 위로
            if ((n - 1 - col) % 2 == 0) {
                for (int row = n - 1; row >= 0; row--) {
                    grid[row][col] = num++;
                }
            } 
            // 홀수번째 열(0-based로 짝수 인덱스)은 위에서 아래로
            else {
                for (int row = 0; row < n; row++) {
                    grid[row][col] = num++;
                }
            }
        }
        
        // 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(grid[i][j]);
                if (j < n - 1) System.out.print(" ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}