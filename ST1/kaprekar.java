// import java.util.*;
// public class kaprekar {


//     public static boolean isKaprekar(int n){
//         int sq=n*n,dig=0;
//         while(sq>0)
//         {
//             dig++;
//             sq=sq/10;
//         }
//         sq=n*n;
//         int c=(int)Math.ceil(dig/2);
//         int pow=(int)Math.pow(10,c);
//         int x=sq%pow;
//         int y=sq/pow;
//         if(x==0 || y==0)
//         {
//             return false;
//         }
//         else if(x+y==n)
//         {
//             return true;
//         }
//         return false;
//     }

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         if(n==1)
//         {
//             System.out.println("Yes");
//             return;
//         }
//         if(isKaprekar(n))
//         System.out.println("Yes");
//         else
//         System.out.println("No");
//     }    
// }

import java.util.*;
public class kaprekar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        if(n==1)
        {
            System.out.println("Yes");
            return ;
        }
        int sq=n*n,dig=0;
        while(sq>0)
        {
            dig++;
            sq=sq/10;
        }
        sq=n*n;
        int a=(int)Math.ceil(dig/2);
        int pow=(int)Math.pow(10,a);
        int x=sq%pow;
        int y=sq/pow;
        if(x==0 || y==0)
        {
            System.out.println("NO");
        }
        else if(x+y==n)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}