public class threadLifecycleYeild {
    public static void main(String[] args) {
        thread1 t1=new thread1();
        thread2 t2=new thread2();
        
        // t1.setName("Thread1");
        // t2.setName("Thread2");

        t1.start();
        t2.start();
    }
}


class thread1 extends Thread{
    @Override
    public void run(){
        String n=Thread.currentThread().getName();
        for(int i=0;i<3;i++)
        {
            System.out.println(n);
            thread1.yield();
        }
    }
}

class thread2 extends Thread{
    @Override
    public void run(){
        String n=Thread.currentThread().getName();
        for(int i=0;i<3;i++)
        {
            System.out.println(n);
        }
    }
}