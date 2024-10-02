import java.util.*;
class EmailCheck
{
  public static void validate(String s)throws EmailValidateException
  {
    if(s.contains("@") && s.indexOf(".com")>s.indexOf("@")){
      System.out.println("Email is valid");
    }
    else
    {
      throw new EmailValidateException("Email is not valid");  
    }
  }
  
  public static void main(String []args)
  {
    Scanner sc=new Scanner (System.in);
    String email=sc.nextLine();
    try{
      validate(email);
    }
    catch(EmailValidateException e){
      System.out.println("EmailValidateException caught");
    }
    finally{
      sc.close();
    }
  }
}

class EmailValidateException extends Exception{
  public EmailValidateException(String message){
    super(message);
  }
}