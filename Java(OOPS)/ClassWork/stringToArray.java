public class stringToArray {
    public static void main(String[] args) {
        String s="G25isthebestclassofChitkaraUniversity";
        // char ch[]=new char[s.length()];
        // for(int i=0;i<s.length();i++)
        // {
        //     ch[i]=s.charAt(i);
        // }
        // for(char c : ch)
        // {
        //     System.out.println("ch"+"["+c+"]");
        // }
        char ch[]=s.toCharArray();
        for(char c : ch)
        {
            System.out.println(c);
        }
    }
}
