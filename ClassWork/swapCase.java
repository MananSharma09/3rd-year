public class swapCase {
    public static void main(String[] args) {
        String s="tHaRaBhAIJoGinDeR";
        String ans="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z')
            ans+=(char)(ch-32);
            else
            ans+=(char)(ch+32);
        }
        System.out.println(ans);
    }
}
