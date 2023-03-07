class printpairsop
{
    public static void printpairs(int arr[])
    {   int tot=0;
        for(int i=0;i<arr.length;i++)
        {  // int curr=arr[i];
            for(int j=i+1;j<arr.length;j++)
            {   
                System.out.print("("+arr[i] + " ," + arr[j] + ")");
                tot++;
         }
            
            System.out.println();
        }
        System.out.println("total pairs are "+tot);
            
    }
    //n(n-1)/2 for tp
    public static void main(String args[])
    {
        int arr[]={1,2,5,8,9};
        printpairs(arr);
        
        
    }
}
