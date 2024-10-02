import java.util.*;

class GreetRev extends Thread{
    int n=0;
    public GreetRev(int n){
        this.n=n;
    }

    @Override
    public void run(){
        for(int i=n;i>0;i--)
        {
            System.out.println("Greeting Thread "+i);
        }
    }
}

public class ReverseGreet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        GreetRev t1=new GreetRev(n);
        t1.start();
    }
}
