
import java.util.Scanner;

public class Lab_3a {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a length of array : ");
        int len = sc.nextInt();

        int[] arr = new int[len];
        System.out.println("Enter a array elemnets : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]  = sc.nextInt();
        }

        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }
    
}