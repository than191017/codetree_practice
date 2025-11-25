import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    double b = 10000 * w / h / h;
    int bb = (int) Math.floor(b);
    
    if (bb>= 25){
        System.out.println(bb);
        System.out.println("Obesity");
    } else
    System.out.println(bb);
    
    
    }
}