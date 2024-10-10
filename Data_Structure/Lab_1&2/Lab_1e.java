import java.util.*;
public class Lab_1e {

    public static int factorial(int n){
        if(n == 1) return 1;
        return n * factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int factorial = factorial(n);
        System.out.println("factorial = "+factorial);
        sc.close();
    
    }
}
