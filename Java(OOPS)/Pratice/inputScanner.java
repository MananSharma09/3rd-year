import java.util.Scanner;
class inputScanner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println("You entered a string : "+s);
        int i=sc.nextInt();
        System.out.println("You enterded an integer : "+i);
        float f=sc.nextFloat();
        System.out.println("You entered a float : "+f);
        sc.close();
    }    
}
