import java.math.BigInteger;
import java.util.*;
public class BigIntFact {

    public static BigInteger fact(int a)
    {
        BigInteger ans=new BigInteger("1");
        for(int i=2;i<=a;i++){
            BigInteger x=BigInteger.valueOf(i);
            ans=ans.multiply(x);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        System.out.println(fact(a));
        sc.close();
    }
}
