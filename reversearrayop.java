class reversearrayop
{
    public static void reversearray(int arr[])
    {
        int first=0;
        int last=arr.length-1;
        while(first<last)
        {
            arr[first]=arr[last]+arr[first]-(arr[last]=arr[first]);
            first++;
            last--;
        }
        
    }
    public static void main(String args[])
    {
        int arr[]={ 1,2,5,8,9};
        reversearray(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print( arr[i]+ " ");
        }
        
    }
}