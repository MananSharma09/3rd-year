public class string {
    public static void main(String[] args) {
        String s="G25isthebestclassofChitkaraUniversity";
        printsubstr(s);
    }
    public static void printsubstr(String s)
    {
        // for(int i=0;i<s.length();i++)
        // {
        //     if(s.charAt(i)=='c')
        //     break;
        //     System.out.print(s.charAt(i));
        // }
        System.out.println(s.substring(0,12));
    }
}
