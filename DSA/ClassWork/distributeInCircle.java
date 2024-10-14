import java.util.*;
public class distributeInCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        sc.close();
        int i=c;
        for(int j=1;j<=a;j++)
        {
            if(i>b)
            {
                i=1;
            }
            if(j==a) break;
            i++;
        }
        System.out.println(i);
    }
}



//! (c+(a-1))%b