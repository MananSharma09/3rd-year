// import java.util.*;
// public class NthPrimeNum {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int num=1,count=0,i;
//         while(count<n)
//         {
//             num=num+1;
//             for(i=2;i<=num;i++)
//             {
//                 if(num%i==0)
//                 {
//                     break;
//                 }
//             }
//             if(i==num)
//             count++;
//         }
//         System.out.println(n+" Prime number is "+num);
//     }
// }

import java.util.*;
public class NthPrimeNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int count=0,i,num=1;
        while(count<n)
        {
            num++;
            for(i=2;i<num;i++)
            {
                if(num%i==0)
                break;
            }
            if(i==num)
            count++;
        }
        System.out.println(num);
    }
}