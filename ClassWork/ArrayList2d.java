import java.util.*;
public class ArrayList2d {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> superlist=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        ArrayList<Integer> list3=new ArrayList<>();
        ArrayList<Integer> list4=new ArrayList<>();
        for(int i=0;i<4;i++)
        {
            int n=sc.nextInt();
            list1.add(n);
        }
        for(int i=0;i<4;i++)
        {
            int n=sc.nextInt();
            list2.add(n);
        }
        for(int i=0;i<4;i++)
        {
            int n=sc.nextInt();
            list3.add(n);
        }
        for(int i=0;i<4;i++)
        {
            int n=sc.nextInt();
            list4.add(n);
        }
        sc.close();
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
        System.out.println(list4);

        superlist.add(list1);
        superlist.add(list2);
        superlist.add(list3);
        superlist.add(list4);
        System.out.println(superlist);
    }
}
