import java.util.*;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int j=n-1;
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n/2;i++)
        {
            swap(arr,i,j--);
        }
        
        System.out.println("Rversed Array : ");
        for(int i=0;i<n;i++)
        {
            
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
    public static void swap(int arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    } 
}