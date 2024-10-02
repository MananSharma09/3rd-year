class Bank extends Thread{
    static int bal=5000;
    static int withdraw;
    Bank(int withdraw)
    {
        this.withdraw=withdraw;
    }

    public static synchronized void withdraw(){
        String name=Thread.currentThread().getName();
        if(withdraw<=bal)
        {
            System.out.println(name + " withdraw money");
            bal=bal-withdraw;
        }
        else
        {
            System.out.println(name+" insufficient balance");
        }
    }

    public synchronized void run(){
        withdraw();
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Bank obj=new Bank(5000);
        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj);

        t1.setName("Person 1");
        t2.setName("Person 2");

        Bank obj2=new Bank(5000);
        Thread t3=new Thread(obj2);
        Thread t4=new Thread(obj2);

        t3.setName("Manan");
        t3.setName("Mayank");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }    
}