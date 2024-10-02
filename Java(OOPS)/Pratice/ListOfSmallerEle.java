import java.util.*;
public class ListOfSmallerEle {

    public static List<Integer> SmallEle(List<Integer> li,int n,int k)
    {
        List<Integer> list = new ArrayList<>();
        for(int i : li){
            if(i<k)
            {
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        List<Integer> list = new ArrayList<>();
        int n=sc.nextInt();
        int k=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            list.add(sc.nextInt());
        }
        List<Integer> ans=SmallEle(list,n,k);
        for(int i : ans)
        System.out.println(i);
        sc.close();
    }
}