// public class WrapperClassesBasic {
//     public static void main(String[] args) {
//         int a = 2;
//         Integer b=a;       //autoboxing
//         System.out.println(b);

//         int c=b;           //unboxing
//         System.out.println(c);
//     }
// }

public class WrapperClassesBasic {
    public static void main(String[] args) {
        Dog<String,Integer> d1=new Dog<>("A",1);
        Dog<String,Integer> d2=new Dog<>("qwe",2);
        Dog<Integer,String> d3=new Dog<>(12,"Apple");
        // d1.print();
        // d2.print();
        // d3.print();
        System.out.println(d1.getId());
        System.out.println(d2.getId());
        System.out.println(d3.getId());
    }
}
class Dog<E,V>{
    E id;
    V name;
    public  Dog(E id, V name)
    {
        this.id=id;
        this.name=name;
    }
    // public void print()
    // {
    //     System.out.println("ID : "+id);
    // }
    E getId() {
        System.out.println(name);
        return id;
    }
}