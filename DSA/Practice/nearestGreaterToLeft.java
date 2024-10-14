import java.util.*;
public class nearestGreaterToLeft {

    private static int[] nextGreater(int n,int []nums){
        Stack<Integer> st=new Stack<>();
        int[] ans= new int[n];
        for(int i=0;i<n;i++)
        {
            if(st.isEmpty())
            {
                ans[i]=-1;
            }
            else if(!st.isEmpty() && st.peek()>nums[i])
            {
                ans[i]=st.peek();
            }
            else if(!st.isEmpty() && st.peek()<=nums[i])
            {
                while(!st.isEmpty() && st.peek()<=nums[i])
                {
                    st.pop();
                }
                if(st.isEmpty())
                {
                    ans[i]=-1;
                }
                else
                {
                    ans[i]=st.peek();
                }
            }
            st.push(nums[i]);
        }
        return ans;
    } 

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        sc.close();
        int[]ans = nextGreater(n,nums);
        for(int i=0;i<n;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
}
