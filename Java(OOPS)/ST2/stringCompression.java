import java.util.*;
public class stringCompression {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String str=sc.nextLine();
        sc.close();
        String ans="";
        for(int i=0;i<str.length();i++)
        {
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1))
            {
                count++;
                i++;
            }
            ans+=str.charAt(i);
            if(count>1)
            {
                ans+=count.toString();
            }            
        }
        System.out.println(ans);
    }    
}
