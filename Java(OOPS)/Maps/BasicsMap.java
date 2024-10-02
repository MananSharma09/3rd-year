import java.util.*;
public class BasicsMap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<String,Integer> m=new HashMap<>();
        m.put("gfg",10);
        m.put("ide",15);
        m.put("course",20);
        System.out.println(m);
        for(Map.Entry<String,Integer>e : m.entrySet())
        {
            System.out.println(e.getKey()+" "+e.getValue());
        }
        sc.close();
    }
}
