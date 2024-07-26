public class NEWS {
    public static void main(String[] args) {
        String s="WNEEWSEEN";
        int x=0,y=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='N')
            y++;
            else if(s.charAt(i)=='S')
            y--;
            else if(s.charAt(i)=='E')
            x++;
            else if(s.charAt(i)=='W')
            x--;
        }
        System.out.println((int)Math.sqrt(x*x+y*y));
    }
}
