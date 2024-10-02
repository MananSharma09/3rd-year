import java.util.*;
public class MaxSumofKCons {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int l=0,r=0,sum=0,maxi=Integer.MIN_VALUE;
        while(r<n)
        {
            sum+=arr[r];
            if(r-l+1==k)
            {
                maxi=Math.max(maxi,sum);
                sum-=arr[l];
                l++;
            }
            r++;
        }
        System.out.println(maxi);
        sc.close();
    }
}
