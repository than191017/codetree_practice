import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 입력 받기
        int A = sc.nextInt();
        int B = sc.nextInt();

        // 나머지는 0부터 B-1까지 나올 수 있으므로, 크기가 B인 배열을 생성
        int[] counts = new int[B];

        // 2. A가 1 이하가 되기 전까지 반복 (즉, A > 1 인 동안 반복)
        while (A > 1) {
            int remainder = A % B; // 나머지 구하기
            A = A / B;             // 몫을 다시 A에 저장
            
            counts[remainder]++;   // 해당 나머지의 카운트 증가
        }

        // 3. 등장 횟수의 제곱의 합 계산
        int result = 0;
        for (int count : counts) {
            // 빈도수가 0인 경우 제곱해도 0이므로 상관없음
            if (count > 0) {
                result += (count * count);
            }
        }

        // 4. 결과 출력
        System.out.println(result);
        
        sc.close();
    }
}