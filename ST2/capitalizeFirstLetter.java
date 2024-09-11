import java.util.*;
public class capitalizeFirstLetter {
    public static String capfun(String s)
    {
        String[] words=s.split("[\\s]+");
        StringBuilder sb=new StringBuilder();
        for(String word : words)
        {
            if(word.length()>0)
            {
                sb.append(Character.toUpperCase(word.charAt(0)))
                .append(word.substring(1).toLowerCase())
                .append(" ");
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        System.out.println(capfun(input)); 
    }
}
