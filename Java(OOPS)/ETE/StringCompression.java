import java.util.*;
public class StringCompression {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        sc.close();
        String ans="";
        for(int i=0;i<=s.length()-1;i++)
        {
            int count=1;
            while(i+1<s.length() && s.charAt(i)==s.charAt(i+1))
            {
                count++;
                i++;
            }
            if(count>1){
                ans+=s.charAt(i);
                ans+=count;
            }
            else
            ans+=s.charAt(i);
        }
        System.out.println(ans);
    
    }
}
