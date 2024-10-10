import java.util.Scanner;
public class Lab_3b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int sum=0;
        for (int i = m; i <=n ; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
