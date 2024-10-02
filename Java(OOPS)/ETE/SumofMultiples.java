import java.util.*;
public class SumofMultiples {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int y=sc.nextInt(),sum=0;
        sc.close();
        for(int i=1;i<=y;i++)
        {
            if(i%6==0 || i%10==0)
            {
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
