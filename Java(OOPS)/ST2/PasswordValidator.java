import java.util.*;
public class PasswordValidator {

    public static void validatePass(String s)throws ShortPasswordException
    {
        if(s.length()<8)
        throw new ShortPasswordException("Password is too short. It must be at least 8 characters long.");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        sc.close();
        try{
            validatePass(s);
            System.out.println("Password accepted");
        }
        catch(ShortPasswordException e)
        {
            System.out.println("Error : "+e.getMessage());
        }
    }    
}

class ShortPasswordException extends Exception{
    public ShortPasswordException(String message)
    {
        super(message);
    }
}