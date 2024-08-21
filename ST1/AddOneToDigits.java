import java.util.*;
public class AddOneToDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int num=n;
        int dig=0;
        while(num>0)
        {
            dig++;
            num=num/10;
        }
        int temp=0;
        while(dig>0)
        {
            temp=temp*10+1;
            dig--;
        }
        System.out.println(n+temp);
    }
}
