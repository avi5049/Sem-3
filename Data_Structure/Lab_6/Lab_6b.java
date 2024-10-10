
import  java.util.*;
class Employee{
    int id;
    String name;
    String desigation;
    double salary;
    public void scanEmployeeDetail(){
        
        Scanner sc = new Scanner(System.in);
        this.id = sc.nextInt();
        sc.nextLine();
        this.name = sc.nextLine();
        this.desigation = sc.nextLine();
        this.salary = sc.nextDouble();
    }

    public void printEmployeeDetail(){
        System.out.println(this.id);
        System.out.println(this.name);
        System.out.println(this.desigation);
        System.out.println(this.salary);
    }
}
public class Lab_6b{
    
    public static void main(String[] args) {
        Employee e = new Employee();
        e.scanEmployeeDetail();
        e.printEmployeeDetail();
    }
}