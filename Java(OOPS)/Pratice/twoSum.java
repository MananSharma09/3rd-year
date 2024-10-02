import java.util.*;
public class twoSum {
    public static void main(String[] args) {
        int nums[]={2,7,11,15};
        int target=9;
        twosum(nums,target);
    }

    public static void twosum(int[]arr,int target)
    {
        Arrays.sort(arr);
        int s=0;
        int e=arr.length-1;
        while(s<e)
        {
            if(arr[s]+arr[e]==target){
                System.out.println(arr[s]+" "+arr[e]);
                break;
            }
            else if(arr[s]+arr[e]>target)
            e--;
            else
            s++;
        }
    }
}
