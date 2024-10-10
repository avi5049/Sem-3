// Create a class BankAccount with attributes like account number, balance, 
// account holder and name. Create an array of BankAccount objects to store 
// bank accounts. Implement methods to deposit money, withdraw money and 
// check balance

import java.util.Scanner;

class BankAccount {
    long accountNo;
    double balance;
    String holderName;
    String depositMoney(double amount){
        if(amount<=0){
            return "Please deposit a amount atleast 100";
        }
        balance+=amount;
        return "Successful!";
    }
    String withdrawMoney(double amount){
        if(amount<=0){
            return "Please withdraw a amount atleast 100";
        }else if(balance<amount){
            return "Insufficient Balance!";
        }
        balance-=amount;
        
        return "Successful!";
    }
    double checkBalance(){
        return balance;
    }
}

public class Lab_6e {
    public static void main(String[] args) {
        BankAccount[] ac = new BankAccount[2];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < ac.length; i++) {
            ac[i]= new BankAccount();
            ac[i].accountNo= 168+i;
            System.out.println("Deposit Money");
            double balance = sc.nextDouble();
            ac[i].depositMoney(balance);
        }
        System.out.println("Enter a 1 for withdraw and 2 for check balance");
        int i= sc.nextInt();
            if(i==2){
                System.out.println(ac[0].checkBalance());
            }else if(i==1){
                System.out.println("Enter a Amount");
                double amount = sc.nextDouble();
                System.out.println(ac[0].withdrawMoney(amount));
            }
        
    }
}
