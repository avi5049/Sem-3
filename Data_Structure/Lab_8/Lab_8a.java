import java.util.*;

class Revpol{
	public int ipf(char symbols){
		if(symbols=='+' || symbols=='-' ){
			return 1;
		}else if(symbols=='*' || symbols=='/' ){
			return 3;
		}else if(symbols=='^' ){
			return 6;
		}else if(symbols=='('){
			return 9;
		}else if(symbols==')'){
			return 0;
		}
		else
		{
		    return 7;
		}
		
	}
	public int spf(char symbols){
		if(symbols=='+' || symbols=='-' ){
			return 2;
		}else if(symbols=='*' || symbols=='/' ){
			return 4;
		}else if(symbols=='^'){
			return 5;
		}else if(symbols=='('){
			return 0;
		}
		else
		{
		    return 8;
		}
		

	}
	public int rank(char symbols){
		if(symbols=='+' || symbols=='-' || symbols=='*' || symbols=='/' || symbols=='^'){
			return -1;
		}else {
			return 1;
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
		
		int r=0;

		char nextChar;
		for(i=0; i<exp.length(); i++){
			// if(stack.isEmpty()){
			// 	System.out.println("Invalid! ");
			// 	return;
			// }
            nextChar=exp.charAt(i);
			while(spf(s.peek())>ipf(nextChar))
			{
				char temp = s.pop();
				polish += temp;
				r += rank(temp);
				if(r<1){
					System.out.println("Invalid ! ");
					return;
				}
			}

			if(spf(s.peek()) != ipf(nextChar))
			{
				s.push(nextChar);
			}else{
				s.pop();
			}
			// nextChar=exp.charAt(i);
			// i++;
		} 

		if(!s.isEmpty() || r!=1){
			System.out.println("Invalid ccccccccccccc");
		}else{
			System.out.println(polish);
		}


	} 
}

public class Lab_8a  {
	public static void main(String[] args) throws EmptyStackException {
		Revpol rev = new Revpol();	
		rev.revpol();
	}
}