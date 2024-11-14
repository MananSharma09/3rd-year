class targetSum {
    public static void main(String[] args) {
        int target=30;
        int arr[]={10,20,30};
        targetfun(arr,target,0,0,"");
    }    

    static void targetfun(int arr[],int target,int i,int currSum,String out)
    {
        if(i>=arr.length){
            if(currSum==target)
            {
                System.out.println(out);
            }
            return;
        } 
        targetfun(arr, target, i+1, currSum+arr[i], out+arr[i]);
        targetfun(arr, target, i+1, currSum, out);
    }
}
