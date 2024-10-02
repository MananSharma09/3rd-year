import java.util.*;
public class countVowels {
    public static boolean isVowel(char c)
    {
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ||
        c=='A' ||c=='E' ||c=='I' ||c=='O' ||c=='U')
        return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(isVowel(s.charAt(i)))
            count++;
        }
        sc.close();
        System.out.println(count);
    }
}
