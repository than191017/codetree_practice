import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        int ak=sc.nextInt();
        char b=sc.next().charAt(0);
        int bk=sc.nextInt();
        char c=sc.next().charAt(0);
        int ck=sc.nextInt();


        if ((ak>=37) && (a=='Y'))
            if (((bk>=37) && (b=='Y')) || ((ck>=37) && (c=='Y')))
                System.out.println("E");
            else
                System.out.println("N");
        else if (((bk>=37) && (b=='Y')) && ((ck>=37) && (c=='Y')))
            System.out.println("E");
        else
            System.out.println("N");
    }
}
