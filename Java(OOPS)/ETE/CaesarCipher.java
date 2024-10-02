import java.util.*;
public class CaesarCipher {

    public static String encrypt(String s,int k)
    {
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(Character.isUpperCase(c))
            {
                char temp=(char)(((c-'A'+k)%26)+'A');
                sb.append(temp);
            }
            else if(Character.isLowerCase(c))
            {
                char temp=(char)(((c-'a'+k)%26)+'a');
                sb.append(temp);
            }
            else
            sb.append(c);
        }
        return sb.toString();
    }

    public static String decrypt(String etext,int k)
    {
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<etext.length();i++)
        {
            char c=etext.charAt(i);
            if(Character.isUpperCase(c))
            {
                char temp=(char)((((c-'A'-k)+26)%26)+'A');
                sb.append(temp);
            }
            else if(Character.isLowerCase(c))
            {
                char temp=(char)((((c-'a'-k)+26)%26)+'a');
                sb.append(temp);
            }
            else
            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int k=sc.nextInt();
        sc.close();
        String etext=encrypt(s,k);
        System.out.println(etext);
        String dtext=decrypt(etext,k);
        System.out.println(dtext);
    }
}
