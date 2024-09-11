import java.util.*;
public class StringContainsVowels {

    public static void validateString(String s)throws InvalidString
    {
        if(!s.contains("a") && !s.contains("e") && !s.contains("i") && !s.contains("o") && !s.contains("u"))
        {
            throw new InvalidString("String does not contains vowels");
        }
        else
        {
            System.out.println("Valid string");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String s=sc.nextLine();
        sc.close();
        try{
            validateString(s);
        }
        catch(InvalidString e)
        {
            System.out.println("Exception caught : "+e.getMessage());
        }
    }
}

class InvalidString extends Exception
{
    public InvalidString(String message)
    {
        super(message);
    }
}
