// Multihreading And Multitasking is used to implements Multitasking
// For multitasking we prefer multithreading and ignore multiprocessing
// Multithreading is lightweight and efficient whereas Multiprocessing is heavyweight and low efficiency. Saving time, full CPU utilization.
// Thread is located in java.lang.package, it is basic unit of CPU and well known for independent Exception of the program.
//! How to create thread in java : By extending Thread class, By implementing Runnable Interface

public class MultiThreading {
    public static void main(String[] args) {
        A t=new A();
        t.start();
        for(int i=0;i<5;i++)
        {
            System.out.println("Hello World from main thread");
        }
    }    
}
class A extends Thread{
    @Override
    public void run(){
        for(int i=0;i<5;i++)
        {
            System.out.println("Hello World");
        }
    }
}
