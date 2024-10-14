
public class firstUpperCase {
    public static void main(String[] args) {
        char ch=UpperCase("anM", 0);
        if(ch==0)
        {
            System.out.println("No Upper Case");
        }
        else
        {
            System.out.println(ch);
        }
    }

    static char UpperCase(String s,int i)
    {
        if(i>s.length()-1)
        {
            return 0;
        }
        if(Character.isUpperCase(s.charAt(i)))
        {
            return s.charAt(i);
        }
        return UpperCase(s, i+1);
    }
}
