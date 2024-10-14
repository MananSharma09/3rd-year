import java.util.*;
public class primeFactor {

    public static void primeFactorization(int n){
        for(int i=2;i*i<=n;i++)
        {
            while(n%i==0)
            {
                System.out.print(i+" ");
                n/=i;
            }
        }
        if(n>1)
        {
            System.err.print(n);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        primeFactorization(n);
    }
}