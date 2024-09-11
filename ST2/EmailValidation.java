public class EmailValidation {
    public static void validateEmail(String s)throws EmailValidationException
    {
        if(s.contains("@") && (s.indexOf(".com")>s.indexOf("@"))){
            System.out.println("Email is valid");
        }
        else
        {
            throw new EmailValidationException("Email is not valid");
        }
    }
    public static void main(String[] args) {
        try{
            validateEmail("manangmail.com");
        }
        catch(EmailValidationException e)
        {
            System.out.println("Exception Caught : "+e.getMessage());
        }
    }    
}

class EmailValidationException extends Exception{
    public EmailValidationException(String message){
        super(message);
    }
}