import java.util.*;

class Revpol{
    public void revpol(){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<Integer> stack=new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                stack.push(Character.getNumericValue(ch));
            }else{
                int o2=stack.pop();
                int o1=stack.pop();

                switch (ch) {
                    case '+':
                        stack.push(o1+o2);
                        break;
                    case '-':
                        stack.push(o1-o2);
                        break;
                        case '/':
                        stack.push(o1/o2);
                        break;
                    case '*':
                        stack.push(o1*o2);
                        break;
                }
            }
        }

        System.out.println(stack.pop());
    }
}

public class Lab_8c  {
	public static void main(String[] args) throws EmptyStackException {
		Revpol rev = new Revpol();	
		rev.revpol();
	}
}