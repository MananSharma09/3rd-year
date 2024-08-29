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
//         for(int i=0;i<dig;i++)
//         {
//             int pow=(int)Math.pow(10,i);
//             // if(pow==n)
//             // continue;
//             int x=sq%pow;
//             int y=sq/pow;
//             if(x==0 || y==0) continue;
//             if(x+y==n)
//             {
//                 return true;
//             }
//         }
//         return false;
//     }

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         sc.close();
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

    public static boolean isKap(int n)
    {
        int sq=n*n;
        int dig=0;
        while (sq>0) 
        {
            dig++;
            sq=sq/10;    
        }
        sq=n*n;
        for(int i=0;i<dig;i++)
        {
            int pow=(int)Math.pow(10,i);
            int x=sq%pow;
            int y=sq/pow;
            if(x==0 || y==0)
            continue;
            if(x+y==n)
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==1)
        {
            System.out.println("No");
            return;
        }
        if(isKap(n))
        {
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
    }
}