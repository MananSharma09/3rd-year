import java.util.*;
public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];

        int count=0,total=0;
        total=n*m;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int startrow=0,endrow=n-1;
        int startcol=0,endcol=m-1;

        while (count<total) {
            for(int i=startcol;i<=endcol;i++)
            {
                System.out.print(arr[startrow][i]+" ");
                count++;
            }
            startrow++;
            for(int i=startrow;i<=endrow;i++)
            {
                System.out.print(arr[i][endcol]+" ");
                count++;
            }
            endcol--;
            for(int i=endcol;i>=startcol;i--)
            {
                System.out.print(arr[endrow][i]+" ");
                count++;
            }
            endrow--;
            for(int i=endrow;i>=startrow;i--)
            {
                System.out.print(arr[i][startcol]+" ");
                count++;
            }
            startcol++;
        }
        sc.close();
    }
}