import java.util.*;
public class reverseString {

    public static void reverse(String s)
    {
        String res="";
        for(int i=s.length()-1;i>=0;i--)
        {
            res+=s.charAt(i);
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String s=sc.nextLine();
        reverse(s);
        sc.close();
    }    
}
