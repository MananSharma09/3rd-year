import java.util.*;
public class searchIn2darray {


    public static boolean search(int arr[][],int target,int n, int m)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(arr[i][j]==target)
                {
                    System.out.println(i+" "+j);
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int [n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(search(arr,14,n,m));
        sc.close();
    }
}
