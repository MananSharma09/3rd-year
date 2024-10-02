// import java.util.*;
// public class nthPrimeNumber {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n = sc.nextInt();
//         int num,count=0,i;
//         num=1;
//         while(count<n){
//             num++;
//             for(i=2;i<=num;i++){
//                 if(num%i==0)
//                 break;
//             }
//             if(i==num)
//             count++;
//         }
//         System.out.println(num);   
//     }
// }
import java.util.*;
public class nthPrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int num,count=0,i;
        num=1;
        while(count<n)
        {
            num++;
            for(i=2;i<=num;i++)
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