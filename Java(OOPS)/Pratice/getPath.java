public class getPath {
    public static int getshortestPath(String s)
    {
        int x=0,y=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='N')
            {
                y++;
            }
            else if(s.charAt(i)=='S')
            {
                y--;
            }
            else if(s.charAt(i)=='E')
            {
                x++;
            }
            else{
                x--;
            }
        }
        double ans = Math.sqrt((x*x)+(y*y));
        return (int)ans;
    }
    public static void main(String[] args) {
        String s="WNEENESENNN";
        System.out.println(getshortestPath(s));
    }
}