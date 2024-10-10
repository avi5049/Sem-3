import java.util.*;
public class Lab_5c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word= sc.nextLine();

        int length = (int)(Math.random()*args.length);
        String random = args[length];
        System.out.println(random);
        boolean isSame =true;
        if(random.length()!=word.length()){
            System.out.println("Not same");
        }else{
            for (int i = 0; i < word.length(); i++) {
                for (int j = i; j < word.length(); j++) {
                    if(word.charAt(i)==random.charAt(j)){
                        break;
                    }else{
                        isSame=false;
                        break;
                    }
                }
            }
            if(!isSame){
                System.out.println("not same");
            }else{
                System.out.println("same");
            }
        }

    }
}   
