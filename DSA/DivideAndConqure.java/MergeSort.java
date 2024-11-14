public class MergeSort {

    static void merge (int[]arr,int si,int mid ,int ei)
    {
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei)
        {
            if(arr[i]<arr[j])
            {
                temp[k++]=arr[i++];
            }
            else
            {
                temp[k++]=arr[j++];
            }
        }
        while(i<=mid)
        {
            temp[k++]=arr[i++];
        }
        while(j<=ei)
        {
            temp[k++]=arr[j++];
        }

        for(k=0,i=si;k<temp.length;k++,i++)
        {
            arr[i]=temp[k];
        }
    }

    static void sort(int[]arr,int s,int e)
    {
        if(s==e){
            return ;
        }
        int mid=s+(e-s)/2;
        sort(arr,0,mid);
        sort(arr,mid+1,e);

        merge(arr,s,mid,e);
    }

    public static void main(String[] args) {
        int[]arr={6,2,1,5,2,4};
        sort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
