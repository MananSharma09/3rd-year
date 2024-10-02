import java.util.*;
public class MaximumProdSubarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        while(sc.hasNextInt())
        {
            list.add(sc.nextInt());
        }
        int maxi=Integer.MIN_VALUE;
        int prod=1;
        for(int i=0;i<list.size();i++)
        {
            prod*=list.get(i);
            maxi=Math.max(prod,maxi);
            if(prod==0)
            prod=1;
        }
        prod=1;
        for(int i=list.size()-1;i>=0;i--)
        {
            prod*=list.get(i);
            maxi=Math.max(prod,maxi);
            if(prod==0)
            prod=1;
        }
        System.out.println(maxi);
        sc.close();
    }
}