import java.util.*;
public class BinaryToDEcimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        String s=Integer.toString(n);
        int dec=0,base=1;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)=='1')
            dec+=base;
            base=base*2;
        }
        System.out.println(dec);
    }
}
