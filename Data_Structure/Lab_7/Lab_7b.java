
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

public class Lab_7b {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str = "abcba";
        Stack s = new Stack(str.length());
        System.out.println("Palindrome : "+ s.palindromeString(str));


    }
}
