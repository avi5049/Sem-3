import java.util.*;;
public class Lab_5b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a n :");
        int n = sc.nextInt();
        System.out.println("Enter a m :");
        int m = sc.nextInt();
        int[][] arr1 = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        int[][] arr2 = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        int[][] arr3 = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    arr3[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3.length; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }    
}
