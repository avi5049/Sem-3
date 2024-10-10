import java.util.*;
public class Lab_4a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a index");
        int index = sc.nextInt();
        System.out.println("Enter a Element");
        int elem = sc.nextInt();
        
        int arr[] = {1,2,3,4,5};
        // int j=0;
        int newArr[] = new int[arr.length+1];
        // for (int i = 0; i < newArr.length; i++) {
        //     if(i==index){
        //         newArr[i] = elem;
        //         continue;
        //     }
        //     newArr[i]=arr[j];
        //     j++;
        // }
        int j=0;
        for (int i = 0; i < index; i++) {
            newArr[i]=arr[j];
            j++;
        }
        newArr[index]=elem;
        for (int i = index+1; i < newArr.length; i++) {
            newArr[i]=arr[j];
            j++;
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }    
}
