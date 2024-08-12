import java.util.*;
public class ArrayListsBasics {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<Integer>();
        // ArrayList<Integer> list1=new ArrayList<>();
        sc.close();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.set(2,100);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.size());
        System.out.println("After"+list);
        System.out.println(list.contains(5));
    }
}
