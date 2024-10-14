import java.util.*;
public class SubSetInterative {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        ArrayList<ArrayList<Integer>> ans = subset(arr);
        // System.out.println(ans);
        for(ArrayList<Integer> li : ans)
        {
            System.out.print(li);
        }        
    }

    static ArrayList<ArrayList<Integer>> subset(int []arr)
    {
        ArrayList<ArrayList<Integer>> outer=new ArrayList<>();

        outer.add(new ArrayList<>());
        for(int num : arr)
        {
            int n=outer.size();
            for(int i=0;i<n;i++)
            {
                ArrayList<Integer> inner =new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }
}
