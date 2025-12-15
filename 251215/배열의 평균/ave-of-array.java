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

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                horSum += arr2d[i][j];
            }
            System.out.printf("%.1f" , (double)(horSum/4));
            System.out.print(" ");
            horSum = 0;
            if(i == 1 && j == 3){
                System.out.println();
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                vertiSum += arr2d[j][i];
            }
            System.out.printf("%.1f" , (double)(vertiSum/2));
            System.out.print(" ");
            vertiSum = 0;
            if(i == 3 && j == 1){
                System.out.println();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                allSum += arr2d[i][j];
            }
        }
        System.out.printf("%.1f" , (double)(allSum/8));



    }
}

