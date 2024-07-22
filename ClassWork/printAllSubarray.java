/* 
// import java.util.*;
public class printAllSubarray {
    public static void main(String[] args) {
        // Scanner sc= new Scanner (System.in);
        int arr[]={2,4,6,8,10};
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                int sum=0;
                for(int k=i;k<=j;k++)
                {
                    sum+=arr[k];
                    if(sum>maxsum)
                    {
                        maxsum=sum;
                    }
                }
            }
        }
        // sc.close();
        System.out.println("Max Sum : "+maxsum);
    }
}
*/

public class printAllSubarray {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<5;i++)
        {
            int sum=0;
            for(int j=i;j<5;j++)
            {
                sum+=arr[j];
            }
            maxsum=Math.max(sum,maxsum);
        }
        System.out.println("Max Sum :"+maxsum);
    }    
}