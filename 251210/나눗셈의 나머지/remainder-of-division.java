import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        // 나머지 횟수를 저장할 배열 (0부터 B-1까지)
        int[] remainderCount = new int[B];
        
        // A가 1 미만이 될 때까지 나눗셈 반복
        while (A >= 1) {
            int remainder = A % B;  // 나머지 구하기
            remainderCount[remainder]++;  // 해당 나머지 카운트 증가
            A = A / B;  // 몫을 A에 저장
        }
        
        // 각 나머지 카운트의 제곱의 합 계산
        int result = 0;
        for (int i = 0; i < B; i++) {
            result += remainderCount[i] * remainderCount[i];
        }
        
        System.out.println(result);
        
        sc.close();
    }
}