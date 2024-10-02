import java.util.*;
public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        sc.close();
        String words[]=s.split(" ");
        String res="";
        for(String word : words)
        {
            res+=reverseWord(word)+" ";
        }
        System.out.println(res.trim());
    }

    public static String reverseWord(String word)
    {
        char[] s=word.toCharArray();
        int left=0,right=s.length-1;
        while(left<right)
        {
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }
        return new String(s);
    }
}
