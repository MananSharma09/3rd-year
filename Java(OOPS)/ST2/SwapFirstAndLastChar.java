import java.util.*;
class SwapFirstAndLastChar{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        sc.close();
        String words[]=s.split(" ");
        StringBuilder ans=new StringBuilder("");
        for(String word : words)
        {
            ans.append(word.charAt(word.length()-1))
            .append(word.substring(1,word.length()-1))
            .append(word.charAt(0))
            .append(" ");
        }
        System.out.println(ans);
    }
}