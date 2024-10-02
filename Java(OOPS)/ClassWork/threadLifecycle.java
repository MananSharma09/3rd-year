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
//!isAlive()
//true if thread is alive else false
//t.start se pehle false aur t.start ke baad alive(true)
//!interrupt()
//A method that interrupts a thread. if you want to interrupt a thread it should be in waiting state/Blocked State

// public class threadLifecycle {
//     public static void main(String[] args)throws InterruptedException {
//         A t1=new A();
//         A t2=new A();
//         A t3=new A();

//         t1.setName("Thread1");
//         t2.setName("Thread2");
//         t3.setName("Thread3");

//         t1.start();
//         t1.join();
//         t2.start();
//         t3.start();

//         for(int i=0;i<3;i++)
//         {
//             System.out.println("main");
//             Thread.sleep(2000);
//         }
//     }
// }

// class A extends Thread{
//     @Override
//     public void run(){
//         //!Override function me throws use nahi kar sakta
//         String n=Thread.currentThread().getName();
//         try{
//             for(int i=0;i<3;i++)
//             {
//                 System.out.println(n);
//                 Thread.sleep(2000);
//             }
//         }
//         catch(InterruptedException e){
//             System.out.println(e);
//         }
//     }
// }

//! isAlive
//  public class threadLifecycle {
//     public static void main(String[] args) {
//         A t1=new A();
//         A t2=new A();
//         System.out.println(t1.isAlive());
//         t1.start();
//         System.out.println(t1.isAlive());
//         System.out.println(t2.isAlive());
//         t2.start();
//         System.out.println(t1.isAlive());
//     }
//  }

//  class A extends Thread{
//     public void run(){
//         System.out.println("isAlive program");
//     }
//  }

//!interrupt
// public class threadLifecycle {
//     public static void main(String[] args) {
//         A t1=new A();
//         t1.start();
//         t1.interrupt();   
//     }
// }

// class A extends Thread {
//     public void run() {
//         try {
//             for (int i = 0; i < 3; i++) {
//                 System.out.println("Thread T1 is running");
//                 Thread.sleep(1000);
//             }
//         } catch (InterruptedException e) {
//             System.out.println("Thread T1 is terminated");
//         }
//     }
// }

//!Thread Priority
// public class threadLifecycle {
//     public static void main(String[] args) {
//         A t1=new A();
//         A t2=new A();
//         A t3=new A();

//         t1.setName("Thread1");
//         t2.setName("Thread2");
//         t3.setName("Thread3");

//         t1.setPriority(2);
//         t2.setPriority(6);
//         t3.setPriority(7);

//         t1.start();
//         t2.start();
//         t3.start();
//     }
// }

// class A extends Thread{
//     public void run(){
//         System.out.println(Thread.currentThread().getName());
//         System.out.println(Thread.currentThread().getPriority());
//     }
// }