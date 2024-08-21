import java.util.*;
public class palindromeString {

    public static boolean isPalindrome(String str,int n,int i)
    {
        if(i>=n/2) return true;
        if(str.charAt(i) != str.charAt(n-i-1))
        return false;

        return isPalindrome(str, n, i+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String str;
        str=sc.nextLine();
        sc.close();
        int n=str.length();
        if(isPalindrome(str,n,0)==true)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}
