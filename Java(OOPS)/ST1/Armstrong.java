import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int num=n,dig=0;;
        while(num>0)
        {
            dig++;
            num=num/10;
        }
        num=n;
        int sum=0;
        while(num>0)
        {
            int d=num%10;
            sum+=Math.pow(d,dig);
            num=num/10;
        }
        if(sum==n){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
}
