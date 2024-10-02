import java.util.*;
public class missingAndOccuTwice{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        int map[]=new int[n+1];
        Arrays.fill(map,0);
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            map[arr[i]]++;
        }
        int miss=-1,rep=-1;
        for(int i=0;i<map.length;i++)
        {
            if(map[i]==0)
            miss=i;
            if(map[i]==2)
            rep=i;
        }
        System.out.println("Missing element : "+miss);
        System.out.println("Reapeating element : "+rep);
        sc.close();
    }
}