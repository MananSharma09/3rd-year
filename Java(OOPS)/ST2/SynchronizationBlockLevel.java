class msg{
    public void show(String name){
        ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
        synchronized(this){
            for(int i=0;i<3;i++)
            {
                System.out.println("Hello how are you "+name);
            }
        }
        ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
    }
}

class OurThread extends Thread{
    msg m;
    String name;
    OurThread(msg m,String name){
        this.m=m;
        this.name=name;
    }

    public void run(){
        m.show(name);
    }
}

public class SynchronizationBlockLevel {
    public static void main(String[] args) {
        msg m = new msg(); 
        OurThread t1=new OurThread(m, "Person 1");
        OurThread t2=new OurThread(m, "Person 2");
        t1.start();
        t2.start();
    }
}
