import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        String[] symptom  = new String[3];

        int[] count = new int[5];

        for (int i = 0; i < 3; i++) {
            symptom[i] = sc.next();
            arr[i] = sc.nextInt();
            if (symptom[i].equals("Y") && arr[i] >= 37 ){
                count[1]++;
            }
            else if (symptom[i].equals("N") && arr[i]>= 37 ){
                count[2]++;
            }
            else if (symptom[i].equals("Y") && arr[i] < 37 ){
                count[3]++;
            }
            else {
                count[4]++;
            }
        }

        for (int i = 1 ; i < 5; i++){
            System.out.print(count[i] + " ");
        }
        if (count[1] >= 2){
            System.out.print("E")
        }

    }
}
