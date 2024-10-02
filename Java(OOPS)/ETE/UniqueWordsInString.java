import java.util.*;
public class UniqueWordsInString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        HashSet<String> set=new HashSet<>();
        ArrayList<String> list=new ArrayList<>();
        String words[]=s.split(" ");
        for(String word : words)
        {
            word=word.toLowerCase();
            if(!set.contains(word))
            {
                list.add(word);
                set.add(word);
            }
        }
        for(String i : list)
        {
            System.out.print(i +" ");
        }
        sc.close();
    }
}
