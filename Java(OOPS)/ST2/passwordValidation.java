public class passwordValidation {

    public static void validatePassword(String password)throws PasswordToShortException
    {
        if(password.length()<8){
            throw new PasswordToShortException("Password must be at least 8 characters long");
        }
        else{
            System.out.println("Password is valid");
        }
    }
    public static void main(String[] args) {
        try{
            validatePassword("qwe");
        }
        catch(PasswordToShortException e){
            System.out.println("Exception caught: "+e.getMessage());
        }
    }    
}

class PasswordToShortException extends Exception{
    public PasswordToShortException(String message){
        super(message);
    }
}