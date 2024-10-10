//pascal triangle
public class Lab_3g{
    public static void main(String[] args) {
        int n=8;
        int num;
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n-i; j++) {
                System.out.print(" ");
            }
            num=1;
            for (int j = 0; j <=i; j++) {
                System.out.print( num + " ");
                num = num*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
}
