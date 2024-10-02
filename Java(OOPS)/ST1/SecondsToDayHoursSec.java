import java.util.*;
public class SecondsToDayHoursSec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int days=n/86400;
        n=n%86400;
        int hours=n/3600;
        n=n%3600;
        int min=n/60;
        n=n%60;
        int seconds=n;
        System.out.println("Days : "+days);
        System.out.println("Hours : "+hours);
        System.out.println("Minutes : "+min);
        System.out.println("Seconds : "+seconds);
    }
}
