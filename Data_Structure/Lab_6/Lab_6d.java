import java.util.Scanner;

public class Lab_6d {
    static double  celcius(double c){
        return (9/5*c)+32;
    }
    static double ferhnhit(double f){
        return ((f-32)*5)/9;
    }
    public static void main(String[] args) {
         int i;
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a 1 for c -> f OR 2 for f -> c");
         i = sc.nextInt();
         System.out.println("Enter a temp : ");
         double temp = sc.nextDouble();
         if (i==1) {
             System.out.println(celcius(temp));
         }else{
            System.out.println(ferhnhit(temp));

         }

    }
}
