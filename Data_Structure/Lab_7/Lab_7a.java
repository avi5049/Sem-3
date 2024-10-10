
import java.util.Scanner;

class Stack {

    int max;
    int arr[];
    int top = -1;

    public Stack(int max) {
        this.max = max;
        arr = new int[max];
    }

    public void push(int x) {
        if (top >= max) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            arr[top] = x;
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        top--;
        return arr[top + 1];

    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        }
        for (int i = top; i >= 0; i--) {
            System.out.print( arr[i] + " ");
            
        }
        System.out.println();
    }

    public int peep(int i) {
        if (top - i + 1 <= -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top - i + 1];

    }

    public void change(int i, int x) {
        if (top -i + 1 <= -1) {
            System.out.println("Stack Underflow");
            return;
        }
        arr[top - i + 1] = x;

    }

    public boolean palindromeString(String str){
        Stack stk = new Stack(max);
        int i=0;
        while(str.charAt(i)!='c'){
            stk.push(str.charAt(i));
            i++;
        }

        for (int j = i+1; j < str.length(); j++) {
            if (str.charAt(j)!=stk.pop()) {
                return false;
            }
        }
        return true;
    }
}

public class Lab_7a {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a size : ");
        // int max = sc.nextInt();
        // Stack s = new Stack(max);
        // while (true) {
        // System.out.println("Enter a 1 : push ,");
        // System.out.println("Enter a 2 : pop ,");
        // System.out.println("Enter a 3 : display ,");
        // System.out.println("Enter a 4 : peep ,");
        // System.out.println("Enter a 5 : change ,");
        // int input = sc.nextInt();

        

        //     switch (input) {
        //         case 1:
        //             System.out.println("Enter a num and -1 for exit : ");
        //             int x = sc.nextInt();
        //             while (x != -1) {
        //                 s.push(x);
        //                 x = sc.nextInt();
        //             }
        //             break;
        //         case 2:
        //             s.pop();
        //             break;
        //         case 3:
        //             s.display();
        //             break;
        //         case 4:
        //             System.out.println("Enter a position : ");
        //             int i = sc.nextInt();
        //             System.out.println("Element : " + s.peep(i));
        //             break;
        //         case 5:
        //             System.out.println("Enter a position : ");
        //             int i1 = sc.nextInt();
        //             System.out.println("Enter a element : ");
        //             int x1 = sc.nextInt();
        //             s.change(i1, x1);
        //             break;
        //         default:
        //             System.out.println("Invalid Number !");
        //             break;
        //     }
        // }
        String str = "abcba";
        Stack s = new Stack(str.length());

        System.out.println("Palindrome : "+ s.palindromeString(str));


    }
}
