import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr1d = new int[n][m];
        int[][] arr2d = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr1d[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr2d[i][j] = sc.nextInt();
            }
        }

        // 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr1d[i][j] == arr2d[i][j]){  // 같으면
                    System.out.print(0 + " ");     // 0 출력
                }
                else{                              // 다르면
                    System.out.print(1 + " ");     // 1 출력
                }
            }
            System.out.println();
        }
    }
}