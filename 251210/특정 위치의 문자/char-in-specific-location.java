import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 문제에서 주어진 대로 문자 배열 만들기
        // L, E, B, R, O, S 순서로 초기화
        char[] arr = {'L', 'E', 'B', 'R', 'O', 'S'};

        // 2. 찾을 문자 입력 받기
        // 자바 Scanner에는 문자를 하나만 받는 기능이 따로 없어서,
        // 문자열(String)로 받은 뒤 첫 번째 글자(.charAt(0))를 가져옵니다.
        char target = sc.next().charAt(0);

        // 3. 배열을 돌면서 위치 찾기
        int foundIndex = -1; // 못 찾았을 경우를 표시하기 위해 -1로 초기화

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                foundIndex = i; // 같은 문자를 찾으면 그 위치(인덱스)를 저장
                break;          // 찾았으니 더 이상 반복할 필요 없이 탈출
            }
        }

        // 4. 결과 출력
        if (foundIndex != -1) {
            // 찾았으면 인덱스 출력
            System.out.println(foundIndex);
        } else {
            // 못 찾았으면(여전히 -1이면) None 출력
            System.out.println("None");
        }
        
        sc.close();
    }
}