import java.util.*;
public class ReplaceFirstAndLastChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char c=sc.next().charAt(0);
        String words[]=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(String word : words)
        {
            sb.append(c)
            .append(word.substring(1,word.length()-1))
            .append(c)
            .append(" ");
        }
        System.out.println(sb.toString().trim());
        sc.close();
    }
}