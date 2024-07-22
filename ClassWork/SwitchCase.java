import java.util.*;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int month = sc.nextInt();
        switch(month)
        {
            case 1:
            System.out.println("January"); 
            break;
            case 2:
            System.out.println("Feb");
            break;
            default:
            System.out.println("Wrong Input");
        }
        sc.close();
    }
}
