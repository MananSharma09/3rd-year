import java.util.*;
public class numberOfFactor {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        double n=sc.nextDouble();
        double p=Math.sqrt(n);
        if(p*p==n)
        {
            System.out.println("Odd");
        }
        else
        {
            System.out.println("Even");
        }
        sc.close();
    }
}
