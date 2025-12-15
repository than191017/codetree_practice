import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr2d = new int[2][4];
        int horSum = 0;
        int vertiSum = 0;
        int allSum = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                arr2d[i][j] = sc.nextInt();
            }
        }

        // 가로 평균
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                horSum += arr2d[i][j];
            }
            System.out.printf("%.1f" , (double)horSum/4);  // 수정
            System.out.print(" ");
            horSum = 0;
        }
        System.out.println();

        // 세로 평균
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                vertiSum += arr2d[j][i];
            }
            System.out.printf("%.1f" , (double)vertiSum/2);  // 수정
            System.out.print(" ");
            vertiSum = 0;
        }
        System.out.println();

        // 전체 평균
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                allSum += arr2d[i][j];
            }
        }
        System.out.printf("%.1f" , (double)allSum/8);  // 수정

    }
}