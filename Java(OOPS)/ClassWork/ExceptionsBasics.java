//? Java Exception:An unexpected event that occurs during program execution
//It affects the flow of program and can make th program terminate abruptly
// public class ExceptionsBasics {
//     public static void main(String[] args) {
//         int arr[]=new int [10];
//         try{
//             int num=5/0;
//             System.out.println(arr[11]);  //! Will give error. It is a runtime exception.
//         }
//         catch(ArrayIndexOutOfBoundsException e){
//             System.out.println(e.getMessage());
//         }catch(ArithmeticException e)
//         {
//             System.out.println(e);
//         }
//         System.out.println("I am into the new class");
//     }    
// }


// public class ExceptionsBasics {
//     public static void main(String[] args) {
//         int arr[]=new int [10];
//         try{
//             int num=5/0;
//             System.out.println(arr[11]);  //! Will give error. It is a runtime exception.
//         }
//         catch(Exception e){
//             System.out.println(e.getMessage());
//         }
//         System.out.println("I am into the new class");
//     }    
// }

// Java Runtieme Exception:
// also called as unchecked Exception
// These exceptions are checked at runtime and not compile time.s


//! Types of Exceptions: 
//* Run Time Exceptions
// Null pointer Exception: Occurs when we miss to initialize a variable.
// ArrayIndexOutOfBounds Exception: Outbound array accessed.
// Arithmetic Exception: Division by zero.
//! Above all are child class of Exception class.


//! Java IO Exception Exception/compile time Exception/Check Exception;
// These exceptions are checked at compile time and the programmer is prompted with a message


// To handle exception wwe use try catch block

// throws Keyword:
// We use throws keyword to tell programmer what kind of Exception is expected from the function which programmer is using. We use throws
// keyword at time of function declaration. 

/**
 * ExceptionsBasics
 */
import java.util.*;
public class ExceptionsBasics {
    

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a valid age : ");
        int age=sc.nextInt();
        sc.close();
        try{
            if(age>100)
            {
                throw new MyException("This is my exception");
            }
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
        System.out.println("I am out of Exception");
    }
}

class MyException extends Exception{
    public MyException(String message)
    {
        super(message);
    }
}