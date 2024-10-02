// import java.util.*;
// public class palindromeCounter {

//     public static boolean isPalin(String s)
//     {
//         s=s.toLowerCase();
//         if (s.length()==1) {
//             return false;
//         }
//         for(int i=0;i<s.length()/2;i++)
//         {
//             if(s.charAt(i)!=s.charAt(s.length()-i-1))
//             return false;
//         }
//         return true;
//     }

//     public static int palinCount(String s)
//     {
//         int count=0;
//         String []words=s.split("\\W+");
//         for(String word : words)
//         {
//             if(isPalin(word)){
//                 count++;
//                 System.out.println(word);
//             }
//         }
//         return count;
//     }

//     public static void main(String[] args) {
//         Scanner sc=new Scanner (System.in);
//         String s = sc.nextLine();
//         sc.close();
//         System.out.println("Palindrome count : "+palinCount(s)); 
//     }
// }
import java.util.*;
public class palindromeCounter {

    public static boolean isPalin(String word)
    {
        word=word.toLowerCase();
        for(int i=0;i<word.length()/2;i++)
        {
            if(word.charAt(i) != word.charAt(word.length()-i-1))
            return false;
        }
        return true;
    }

    public static int fun(String s)
    {
        int count=0;
        String words[]=s.split(" ");
        for(String word : words)
        {
            if(isPalin(word))
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        sc.close();
        System.out.println("Palindrome count : "+fun(s));
    }
}