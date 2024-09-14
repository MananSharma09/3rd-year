//! What is sleep Method ?
//Sleep is a static method of thread class
//It throws a checked Exception i.e.,InterruptedException
//Main function is to put a thread into a temporary waiting/Blocked state
//!What is suspend() and resume() method?  they are both suspended and cannot be used
//main purpose of suspends is to put the main thread from running state to waiting state
// resume method is used resume a suspended thread from suspended state to running state
//!What is yeild with program
//Yield is a method of thread class that allows us to run another thread which has same priority by pausing itself.
//!stop 
//it is used to terminate the thread

public class threadLifecycle {
    public static void main(String[] args)throws InterruptedException {
        A t1=new A();
        A t2=new A();
        A t3=new A();

        t1.setName("Thread1");
        t2.setName("Thread2");
        t3.setName("Thread3");

        t1.start();
        t1.join();
        t2.start();
        t3.start();

        for(int i=0;i<3;i++)
        {
            System.out.println("main");
            Thread.sleep(2000);
        }
    }
}

class A extends Thread{
    @Override
    public void run(){
        //!Override function me throws use nahi kar sakta
        String n=Thread.currentThread().getName();
        try{
            for(int i=0;i<3;i++)
            {
                System.out.println(n);
                Thread.sleep(2000);
            }
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
