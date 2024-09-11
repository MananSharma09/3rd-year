import java.util.*;
public class stringCompression1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char arr[]=new char[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.next().charAt(0);
        }
        for(int i=0;i<n;i++)
        {
            int count=1;
            while (i+1<n && arr[i]==arr[i+1]) {
                count++;
                i++;
            }
            System.out.print(arr[i]);
            if(count>1)
            System.out.print(count);
            sc.close();
        }
    }
}