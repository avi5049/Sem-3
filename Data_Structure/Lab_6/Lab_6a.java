
import java.util.Scanner;

public class Lab_6a{
    static void swap(int n1 , int n2){
        int temp = n1;
        n1=n2;
        n2=temp;

        System.out.println("n1 : "+n1);
        System.out.println("n2 : "+n2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1= sc.nextInt();
        int n2 = sc.nextInt();
        swap(n1,n2);
    }
}