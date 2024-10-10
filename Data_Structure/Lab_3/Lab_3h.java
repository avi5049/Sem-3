// WAP to sort the N names in an alphabetical order
import java.util.*;
public class Lab_3h {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a length of array : ");
        int len = sc.nextInt();

        String[] str= new String[len];

        for (int i = 0; i < str.length; i++) {
            str[i]=sc.next();
        }

        for (int i = 0; i < str.length; i++) {
            for (int j = i+1; j < str.length; j++) {
                if(((int)str[i].charAt(0))>((int)str[j].charAt(0))){
                    String temp = str[i];
                    str[i]=str[j];
                    str[j]=temp;
                }
            }
        }
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " ");
        }
    }
}