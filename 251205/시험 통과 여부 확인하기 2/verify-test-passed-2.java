import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int jumsu[] = new int[4]; // 4개의 정수값 저장
        int sum;
        double avg;
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = 0; j < 4; j++) {
                jumsu[j] = sc.nextInt();
                sum += jumsu[j];
            }
            avg = (double) sum / 4; // int에서 double로 수정
            if (avg >= 60) {
                System.out.println("pass");
                cnt++;
            } else {
                System.out.println("fail");
            }
        }

        System.out.println(cnt);
    }
}

