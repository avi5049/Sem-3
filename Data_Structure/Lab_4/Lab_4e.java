
public class Lab_4e {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,4,5,5,6}; 
        int j=1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1]!=arr[i]){
                arr[j]=arr[i];
                j++;
            }
        }
        for (int i = 0; i < j; i++) {
            System.out.print(arr[i] + " ");
        }
    }    
}



