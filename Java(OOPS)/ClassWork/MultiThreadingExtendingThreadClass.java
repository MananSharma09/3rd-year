// public class MultiThreadingExtendingThreadClass {
//     public static void main(String[] args) {
//         T1 t1=new T1();
//         T2 t2=new T2();
//         t1.start();
//         t2.start();
//         for(int i=1;i<=15;i++)
//         {
//             System.out.println("Main Thread Running");
//         }
//     }
// }

// class T1 extends Thread{
//     @Override
//     public void run(){
//         for(int i=1;i<=5;i++)
//         {
//             System.out.println("Hello");
//         }
//     }
// }
// class T2 extends Thread{
//     @Override
//     public void run(){
//         for(int i=1;i<=2;i++)
//         System.out.println("World");
//     }
// }

public class MultiThreadingExtendingThreadClass {
    public static void main(String[] args)throws Exception {
        T1 t1 = new T1();
        T2 t2 = new T2();
        t1.fun();
        t2.start();
        for(int i=1;i<=10;i++)
        {
            System.out.println("Main Thread");
            Thread.sleep(1000);
        } 
    }    
}
class T1 extends Thread{
    public void fun(){
        try{
            for(int i=1;i<=5;i++)
            {
                System.out.println("Hello");
                Thread.sleep(1000);
            }
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}

class T2 extends Thread{
    @Override
    public void run(){
        for(int i=1;i<=2;i++)
        {
            System.out.println("World");
        }
    }
}