import java.util.*;
public class SumTonRec {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        sc.close();
        System.out.println(sumToN(n));
    }

    public static int sumToN(int n)
    {
        if(n==1)
        return 1;

        return n+sumToN(n-1);
    }
}