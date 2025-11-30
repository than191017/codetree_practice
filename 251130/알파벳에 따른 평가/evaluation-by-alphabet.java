import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        if ( n == "S"){
            System.out.println("Superior");
        }

        else if (n == "A"){
            System.out.println("Excellent");
        }

        else if (n == "B"){
            System.out.println("Good");
        }

        else if (n == "C"){
            System.out.println("Usually");
        }

        else if (n == "D"){
            System.out.println("Effort");
        }

        else{
            System.out.println("Failure");

        }
    }
}