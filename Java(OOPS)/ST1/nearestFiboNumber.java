import java.util.*;
public class nearestFiboNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int first=0,second=1;
        int third=first+second;
        while(third<=n)
        {
            first =second;
            second=third;
            third=first+second;
        }
        int ans=Math.abs(third-n)>=Math.abs(second-n) ? second : third;
        System.out.println(ans);
    }
}
