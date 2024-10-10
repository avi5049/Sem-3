//Read  n  numbers  in  an  array  then  read  two  different  numbers,  replace  1st 
// number with 2nd number in an array and print its index and final array.

import java.util.*;
public class Lab_3f {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5,6};
        int a = sc.nextInt();
        int b = sc.nextInt();
        int fi = 0;
        int si = 0;
        for (int i = 0; i < arr.length; i++) {
            if(a==arr[i]){
                fi=i;
            }
            if(b==arr[i]){
                si=i;
            }
        }
        if(fi==-1 || si==-1){
            System.out.println("not found");
        }else{
            arr[fi]=arr[si];
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
            }
        }

    }
}
