import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        if ( (a-c)> 0 && (b-d)>0){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }



    }
}