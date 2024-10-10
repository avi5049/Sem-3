
import  java.util.*;
class Student{
    int enrollment;
    String name;
    int semester;
    double spi;
    public void scanDetail(){
        
        Scanner sc = new Scanner(System.in);
        this.enrollment = sc.nextInt();
        sc.nextLine();
        this.name = sc.nextLine();
        this.semester = sc.nextInt();
        this.spi = sc.nextDouble();
    }

    public void printDetail(){
        System.out.println(this.enrollment);
        System.out.println(this.name);
        System.out.println(this.semester);
        System.out.println(this.spi);
    }
}
public class Lab_6c{
    
    public static void main(String[] args) {
        Student[] student = new Student[5];

        for (int i = 0; i < student.length; i++) {
            student[i] = new Student();
            student[i].scanDetail();
            
            student[i].printDetail();
            
        }



    }
}