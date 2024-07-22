import java.util.*;
public class nthTermofAP {

    public static int nthTermof(int a,int d,int n)
    {
        int ans=a+(n-1)*d;
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int d=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(nthTermof(a, d, n));
        sc.close();
    }    
}