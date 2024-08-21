import java.util.*;
public class PowerofN {

    public static int powerofn(int a,int n)
    {
        if(n==0)
        return 1;

        return a*(powerofn(a, n-1));
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int n=sc.nextInt();
        sc.close();
        System.out.println(powerofn(a,n));
    }
}