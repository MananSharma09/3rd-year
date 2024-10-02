import java.util.*;
public class linearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean flag=false;
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int key = sc.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            flag=true;
        }
        if(flag)
        System.out.println("Found");
        else
        System.out.println("Not Found");
        sc.close();
    }
}