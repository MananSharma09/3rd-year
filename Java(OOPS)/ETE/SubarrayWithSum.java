import java.util.*;
public class SubarrayWithSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        sc.close();
        boolean found=false;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)
            {
                sum+=arr[j];   
                if(sum==target){
                    System.out.println(i+" "+j);
                    found=true;
                    break;
                }
            }
            if(found==true)
            break;
        }
        if(!found)
        {
            System.out.println(-1);
        }
    }
}
