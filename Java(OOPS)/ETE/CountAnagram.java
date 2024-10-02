import java.util.*;
public class CountAnagram {

    public static int anagramCount(String input,String anaWord)
    {
        String words[]=input.split(" ");
        int count=0;
        String sortedAnaWord=sortWord(anaWord);
        for(String word : words)
        {
            if(sortWord(word).equals(sortedAnaWord))
            count++;
        }
        return count;
    }

    public static String sortWord(String word)
    {
        char []temp=word.toCharArray();
        Arrays.sort(temp);
        return new String(temp);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String anaWord=sc.nextLine();
        int ans=anagramCount(input,anaWord);
        System.out.println(ans);
        sc.close();
    }
}
