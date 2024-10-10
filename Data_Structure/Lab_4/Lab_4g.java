import java.util.Scanner;
public class Lab_4g {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        String newStr="";
        for (int i = 0; i < str.length(); i++) {
            if(((int)str.charAt(i))>=65 && ((int)str.charAt(i))<=91){
                newStr += (char)(str.charAt(i)+32);
            }
            if(((int)str.charAt(i))>=97 && ((int)str.charAt(i))<=123){
                newStr += (char)(str.charAt(i)-32);
            }
        }
        System.out.println(newStr);
    }
}
 