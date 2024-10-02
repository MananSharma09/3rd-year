// import java.util.*;
// public class rotateString {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String s= sc.nextLine();
//         int k=sc.nextInt();
//         k=k%s.length();
//         char[]temp=new char[s.length()];
//         for(int i=0;i<s.length();i++)
//         {
//             temp[(i-k+s.length())%s.length()]=s.charAt(i);
//         }
//         System.out.println(new String(temp));
//         sc.close();
//     }
// }

import java.util.*;
public class rotateString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int k=sc.nextInt();
        int n=s.length();
        k=k%n;
        char[]temp=new char[n];
        for(int i=0;i<n;i++)
        {
            temp[(i+k)%n]=s.charAt(i);
        }
        System.out.println(new String(temp));
        sc.close();
    }
}