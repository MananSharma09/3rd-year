import java.util.*;
public class Nqueens {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                board[i][j]='.';
            }
        }
        sc.close();
        nqueens(board,0);
    }

    static void nqueens(char[][]board,int row)
    {
        if(row==board.length)
        {
            print(board);
            return;
        }
        for(int j=0;j<board.length;j++)
        {
            if(isSafe(board,row,j))
            {
                board[row][j]='Q';
                nqueens(board, row+1);
                board[row][j]='.';
            }
        }
    }

    static boolean isSafe(char board[][],int row ,int col)
    {
        for(int i=row-1,j=col-1;i>=0 && j>=0; i--,j--)
        {
            if(board[i][j]=='Q')
            return false;
        }
        for(int i=row-1;i>=0;i--)
        {
            if(board[i][col]=='Q')
            return false;
        }
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++)
        {
            if(board[i][j]=='Q')
            return false;
        }
        return true;
    }

    static void print(char board[][])
    {
        System.out.println("--------------------------------");
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board.length;j++)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}
