public class PracticeExcephand {
    public static void main(String[] args) {
        try{
            methodA();
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithematic Exception caught");
        }
        catch(Exception e)
        {
            System.out.println();
        }
    }
    public static void methodA(){
        System.out.println("inside A");
        System.out.println(1/0);
    }
}
