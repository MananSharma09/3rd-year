public class Arraysum {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(sumofarr(arr));
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n"+ sumofarr(arr));

    }
    public static int sumofarr(int arr[])
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }

        arr[0]=5;
        arr[1]=9;
        return sum;
    }
}