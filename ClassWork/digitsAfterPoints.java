import java.util.*;
public class digitsAfterPoints {

    public static String digAfterDecimal(String s)
    {
        int pos=s.indexOf(".");
        if(pos<0) return "";
        else return s.substring(pos+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        sc.close();
        System.out.println(digAfterDecimal(s));
    }
}