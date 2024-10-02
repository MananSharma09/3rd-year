import java.util.*;
public class NthFibo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int first=0;
        int second=1;
        int third=first+second;
        int i=2;
        while(i<n)
        {
            first=second;
            second=third;
            third=first+second;
            i++;
        }
        System.out.println(third);
    }
}
