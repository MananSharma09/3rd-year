public class palindrome {
    public static boolean rev(int i,String s)
    {
        if(i>=s.length())
        return true;

        if(s.charAt(i)!=s.charAt(s.length()-i-1))
        return false;

        return rev(i+1,s);
    }

    public static void main(String[] args) {
        String s="noon";
        if(rev(0,s))
        {
            System.out.println("Paliondrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}
