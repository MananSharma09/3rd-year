import java.util.*;
public class hourglass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int space=0,star=n;
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<=space;j++)
            System.out.print(" ");

            for(int k=0;k<star;k++)
            System.out.print("*");

            if(i<=n/2)
            {
                space++; 
                star-=2;
            }
            else
            {
                space--;
                star+=2;
            }
            System.out.println();
        }
        sc.close();
    }
}
