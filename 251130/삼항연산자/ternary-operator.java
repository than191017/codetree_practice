import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int score;
        String grade;

        score = sc.nextInt();

        grade = score >= 100 ? "pass" : "failure";
        System.out.println(grade);



    }
}