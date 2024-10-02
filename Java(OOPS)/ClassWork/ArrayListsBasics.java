// import java.util.*;
// public class ArrayListsBasics {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         ArrayList<Integer> list=new ArrayList<Integer>();
//         // ArrayList<Integer> list1=new ArrayList<>();
//         sc.close();
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(5);
//         list.set(2,100);
//         System.out.println(list.get(0));
//         System.out.println(list.get(1));
//         System.out.println(list.get(2));
//         System.out.println(list.size());
//         System.out.println("After"+list);
//         System.out.println(list.contains(5));
//     }
// }
// import java.util.*;
// public class ArrayListsBasics {
//     public static void main(String[] args) {
//         // ArrayList<String> list = new ArrayList<String>(); // old
//          ArrayList<String> list = new ArrayList<>(); // new
        
//         // add
//         list.add("Khachi"); // last mai add krta hai
//         list.add("ST1");
//         list.add("ST2");
//         System.out.println("Old List " + list);

        
//         // add - random index
//         list.add(0,"first element"); // beginning mai add
//         list.add(1,"Second Element"); // at index 1
//         System.out.println("New List " + list);
        
        
//         // removal
//         list.remove(2);
//          System.out.println("After Removal New List " + list);
         
        
//         // replace 
//         list.set(2, "Pochinki");
//          System.out.println("After Replace New List " + list);
        
//         // to get single element
//         System.out.println("2nd element " + list.get(2));
//         System.out.println("Size of list : "+list.size());
//         // clear all the elements
//         list.clear();
//         System.out.println("NOICE LIST " + list);
//     }
// }
import java.util.*;
public class  ArrayListsBasics{
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        System.out.println("List 1 " + l1);
        
        l2.add(2);
        l2.add(5);
        l2.add(6);
        l2.add(4);
        System.out.println("List 2 " + l2);
        
        
        // l1.addAll(l2);
        // System.out.println("After Addition new list 1 " + l1)  ;  
        
        
        // to check if an element is present or not
        // System.out.println(l1.contains(100));
        
        // l1.removeAll(l2);
        // System.out.println("After removal " + l1);
        
        System.out.println("list 1 items" + l1);
        l1.retainAll(l2); // intersection elements dono mai woh apke reh gaye
        System.out.println("After operation " + l1);        
    }
}