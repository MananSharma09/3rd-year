import java.util.*;;
public class sample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        sc.close();
        if(s.length()==n)
        {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
