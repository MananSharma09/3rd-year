import java.util.*;
public class ASCIIsum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        sc.close();
        String sum="";
        for(char c : s.toCharArray())
        {
            sum+=Integer.toString((int)c);
        }
        System.out.println(sum);
    }
}
