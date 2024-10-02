import java.util.*;
public class CheckNumberinAscOrder {

    public static boolean check(String s)
    {
        String words[]=s.split("[^1-9]+");
       for(int i=1;i<words.length;i++)
       {
            if(words[i].length()==0 || words[i-1].length()==0)
            continue;
            if(Integer.valueOf(words[i])<Integer.valueOf(words[i-1]))
            {
                return false;
            }
       }
       return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String s=sc.nextLine();
        sc.close();
        if(check(s))
        {
            System.out.println("Series is in ascending order");
        }
        else
        {
            System.out.println("Not in ascending order");
        }
    }
}
