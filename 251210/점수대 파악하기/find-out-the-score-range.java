import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] countArr = new int[11];
        
        while (true) {
            int score = sc.nextInt();
            if (score == 0) {
                break;
            }
            // 10점 이상만 카운트
            else if (score >= 10) {
                int index = score / 10;
                countArr[(index)]++;
            }
        }
        for (int i = 10; i > 0; i--) {
            System.out.println((i*10)+ " - "+ countArr[i]);
        }
        
    }
}