import java.util.*;
public class onetonUsingRec {

    public static void rec(int n)
    {
        // if(i>n)
        // return ;
        // System.out.println(i);
        // rec(i+1,n);
        if(n==0)
        return;
        rec(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        rec(n);
    }
}