import java.util.*;
public class FactorialSequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int[] fact = new int[n+1];
        fact[0]=1;
        for(int i=1;i<=n;i++)
        {
            fact[i]=fact[i-1]*i;
        }
        System.out.println(fact[n]);
        for(int i=0;i<=n;i++)
        {
            System.out.print(fact[i]+" ");
        }  
    }    
}
