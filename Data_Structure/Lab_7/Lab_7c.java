import java.util.Scanner;
import java.util.Stack;
public class Lab_7c {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String : ");
        String s = sc.nextLine();
        int countA=0, countB=0;
        
        Stack<Character> stack = new Stack<>();
        // approach 1
        
        
        // int j=0;
        // int count=0;
        // while(s.charAt(j)!='b'){
        //     stack.push(s.charAt(j));
        //     count++;
        //     j++;
        // }
        // for (int i = j-1; i < s.length(); i++) {
        //     if(count!=0 && s.charAt(i)=='b'){   
        //         stack.pop();
        //         count--;
        //     }else{
        //         break;
        //     }
        // }
        // if(count == 0){
        //     System.out.println("The string is of the form a^i b^i");
        // } else {
        //     System.out.println("The string is not of the form a^i b^i");
        // }

        // approach 2
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == 'a'){
                stack.push(ch);
                countA++;
            }else if(ch == 'b'){
                stack.push(ch);
                countB++;
            }
        }
        if(countA == countB){
            System.out.println("The string is of the form a^i b^i");
        } else {
            System.out.println("The string is not of the form a^i b^i");
        }
    }
}


