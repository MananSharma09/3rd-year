public class QuickSort {
    public static void main(String[] args) {
        int[] arr={6,2,1,5,3};
        quickSort(arr,0,arr.length-1);
        print(arr);
    }

    public static void print(int []arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    static void quickSort(int []arr,int si,int ei)
    {
        if(si>=ei)
        return;

        int pIdx=partition(arr,si,ei);
        quickSort(arr, si, pIdx-1);
        quickSort(arr, pIdx+1, ei);
    }

    static int partition(int arr[],int si,int ei)
    {
        int pivot=arr[ei];
        int i=si-1;

        for(int j=si;j<ei;j++)
        {
            if(arr[j]<=pivot)
            {
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }
}
