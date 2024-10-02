import java.util.Scanner;

public class SubtractOneFromEachDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 4-digit number:");
        int num = sc.nextInt();
        sc.close();
        if (num < 1000 || num > 9999) {
            System.out.println("Invalid input! Please enter a 4-digit number.");
            return;
        }
        
        StringBuilder result = new StringBuilder();
        while (num > 0) {
            int digit = num % 10; 
            digit = (digit == 0) ? 9 : digit - 1;  
            result.insert(0, digit);  
            num /= 10;  
        }
        System.out.println("Modified number: " + result.toString());   
        sc.close();
    }
}
