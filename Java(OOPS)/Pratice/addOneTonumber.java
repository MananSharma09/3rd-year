import java.util.*;
public class addOneTonumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=n,count=0;
        while(num>0)
        {
            count++;
            num=num/10;
        }
        int temp=0;
        while(count>0)
        {
            temp=temp*10+1;
            count--;
        }
        System.out.println(n+temp);   
        sc.close();
    }
}