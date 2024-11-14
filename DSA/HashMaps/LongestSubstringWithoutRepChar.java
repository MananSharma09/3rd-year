import java.util.*;
public class LongestSubstringWithoutRepChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        sc.close();
        HashSet<Character>set=new HashSet<>();
        int maxlen=0;
        int l=0;
        for(int r=0;r<s.length();r++)
        {
            while(set.contains(s.charAt(r)))
            {
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            maxlen=Math.max(maxlen,r-l+1);
        }
        System.out.println(maxlen);
    }
}
