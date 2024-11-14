import java.util.*;
public class N_bits_no_con_Zeros {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> ans=new ArrayList<>();
        int n=sc.nextInt();
        sc.close();
        char[] arr=new char[n];
        generate(n,0,arr,ans);
        for(String s : ans)
        {
            System.out.println(s);
        }
    }
    
    public static void generate(int n,int i,char[] arr,ArrayList<String>ans)
    {
        if(i>=n)
        {
            ans.add(new String(arr));
            return;
        }
        arr[i]='1';
        generate(n,i+1,arr,ans);

        if(i==0 || arr[i-1]!='0')
        {
            arr[i]='0';
            generate(n,i+1,arr,ans);
        }
    }
}
