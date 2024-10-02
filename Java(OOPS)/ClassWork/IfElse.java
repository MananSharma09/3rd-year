import java.util.*;
public class IfElse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Age : ");
        int age = sc.nextInt();
        if(age<=12)
        System.out.println("Child");
        else if (age>12 && age<19)
        System.out.println("Teenage");
        else
        System.out.println("Adult");
        sc.close();
    }
}
