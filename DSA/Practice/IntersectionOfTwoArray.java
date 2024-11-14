import java.util.*;
public class IntersectionOfTwoArray {
    public static void main(String[] args) {
        int arr1[]={4,9,5};
        int arr2[]={9,4,9,8,4};
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                if(arr1[i]==arr2[j])
                {
                    set.add(arr1[i]);
                    break;
                }
            }
        }
        int[]ans=new int[set.size()];
        int ind=0;
        for(int i  : set){
            ans[ind++]=i;
        }
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
}
