import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int[] countArr = new int[100];

        // 입력 받기
        for (int i = 0; i < 100; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 0){
                break;
            }
        }

        // 자릿수 추출하기
        for (int i = 0; i < 100; i++) {            
            if (arr[i] == 0){
                break;
            }
            else {
                countArr[(int)arr[i] / 10]++;
            }
        }

        // 개수 출력 (1부터 9까지)
        for (int i = 1; i < 10; i++) {
            System.out.println(i + " - " + countArr[i]);
        }
    }
}