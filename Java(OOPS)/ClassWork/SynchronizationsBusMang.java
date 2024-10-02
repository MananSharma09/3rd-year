//!Synchronization
// Technique by which you control muiltiple threads.

class Bus implements Runnable{
    int avaliable=10;
    int passenger;

    Bus(int passanger)
    {
        this.passenger=passanger;
    }
    public synchronized void run(){
        String name=Thread.currentThread().getName();
        if(avaliable>=passenger)
        {
            System.out.println(name+" Reserved Seat...!");
            avaliable=avaliable-1;
        }
        else
        {
            System.out.println(name+" Sorry seat not avaliable");
        }
    }
}

public class SynchronizationsBusMang {
    public static void main(String[] args) {
        Bus r = new Bus(9);
        Thread t1=new Thread(r);
        Thread t2=new Thread(r);
        Thread t3=new Thread(r);

        t1.setName("Passenger 1");
        t2.setName("Passenger 2");
        t3.setName("Passenger 3");

        t1.start();
        t2.start();
        t3.start();
    }
}
