import java.util.*;

class Revpol{
	public int priority(char symbols){
		if(symbols=='+' || symbols=='-' ){
			return 1;
		}else if(symbols=='*' || symbols=='/' ){
			return 3;
		}else if(symbols=='^' ){
			return 6;
		}else if(symbols==')'){
			return 0;
		}
		else
		{
		    return -1;
		}
		
	}


	public void revpol(){
		//input the expression
		Scanner sc = new Scanner(System.in);
		String exp = sc.nextLine();
		exp+=')';
		int i;
		//create a Stack
		Stack<Character> s= new Stack<>();
		
		//inialize a top
		s.push('(');
		
		//create polish String
		String polish="";
		
		char nextChar;
		for(i=0; i<exp.length(); i++){
			// if(stack.isEmpty()){
			// 	System.out.println("Invalid! ");
			// 	return;
			// }

			nextChar=exp.charAt(i);
			if(Character.isLetterOrDigit(nextChar) ){
				polish+=nextChar;
			}else if(nextChar==')'){
				while(s.peek()!='('){
					polish+=s.pop();
				}
			}
            else if (nextChar == '^') {
                s.push(nextChar);
            }
			else if(nextChar=='('){
				s.push(nextChar);
			}
			else{
				while (priority(s.peek())<priority(nextChar)) { //when '(' occur then while loop is terminate  
					polish += s.pop();
				}
				s.push(nextChar);
			}
			// nextChar=exp.charAt(i);
			// i++;
		} 

		if(s.isEmpty()){
			System.out.println("Invalid ccccccccccccc");
		}
		System.out.println(polish);


	} 
}

public class Lab_8a2  {
	public static void main(String[] args) throws EmptyStackException {
		Revpol rev = new Revpol();	
		rev.revpol();
	}
}