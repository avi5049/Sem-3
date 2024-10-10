import java.util.Scanner;
public class Lab_3d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int minIndex=0;
        int maxIndex=0;
        System.out.println("Enter a length of array : ");
        int len = sc.nextInt();

        int[] arr = new int[len];
        System.out.println("Enter a array elemnets : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]  = sc.nextInt();
            if(arr[i]>max){
                max = arr[i];
                maxIndex= i;
            }
            if(arr[i]<min){
                min = arr[i];
                minIndex= i;
            }
        }
        System.out.println(minIndex);
        System.out.println(maxIndex);
    }
}