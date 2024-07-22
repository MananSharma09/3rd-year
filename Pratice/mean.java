import java.util.Scanner;
public class mean {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0,count=0;
        while(sc.hasNextInt())
        {
            int n=sc.nextInt();
            sum+=n;
            count++;
        }
        System.out.println("Mean : "+sum/count);
        sc.close();
    }
}
