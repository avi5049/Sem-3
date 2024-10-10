import java.util.Scanner;

public class Lab_4b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a index");
        int index = sc.nextInt();
        
        int arr[] = {1,2,3,4,5};
        // int j=0;
        int newArr[] = new int[arr.length-1];
        int j=0;
        for (int i = 0; i < index; i++) {
            newArr[j]=arr[i];
            j++;
        }
        for (int i = index+1; i < arr.length; i++) {
            newArr[j]=arr[i];
            j++;
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }    
}
