import java.io.*;
class inputBuuffered
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter an integer : ");
        int i=Integer.parseInt(br.readLine());
        System.out.println("The integer is "+i);
    }
}