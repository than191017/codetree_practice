import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr2d = new int[4][4];
        int line = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr2d[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 1; j++) {
                line += arr2d[i][j];
            }
        }

        for (int i = 1; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                line += arr2d[i][j];
            }
        }

        for (int i = 2; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                line += arr2d[i][j];
            }
        }

        for (int i = 3; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                line += arr2d[i][j];
            }
        }

        System.out.print(line);

    }
}