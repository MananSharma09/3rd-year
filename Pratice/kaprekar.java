import java.util.*;
public class kaprekar {

    public static boolean isKaprekar(int n)
    {
        if(n==1) return true;
        int sq=n*n;
        int dig=0;
        while(sq>0)
        {
            dig++;
            sq=sq/10;
        }
        sq=n*n;
        int c=(int)Math.ceil(dig/2);
        int pow=(int)Math.pow(10,c);
        int x=sq%pow;
        int y=sq/pow;
        if(x==0 || y==0)
        return false;
        else if(x+y==n) 
        return true;
        else
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        if(isKaprekar(n))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
