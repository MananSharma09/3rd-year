import java.util.*;
public class nearlySortedArray {

    static int[] nearlySorted(int[]arr,int k)
    {
        PriorityQueue<Integer> pq =new PriorityQueue<>();
        int[]ans=new int[arr.length];
        for(int i=0;i<=k;i++)
        {
            pq.offer(arr[i]);
        }
        int index=0;
        for(int i=k+1;i<arr.length;i++)
        {
            ans[index++]=pq.poll();
            pq.offer(arr[i]);
        }
        while(!pq.isEmpty())
        {
            ans[index++]=pq.poll();
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        sc.close();
        int []ans=nearlySorted(arr,k);
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+ " ");
        }
    }
}
