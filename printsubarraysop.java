class printsubarraysop
{
    public static void printsubarrays(int arr[])
    {   int tot=0;
        for(int i=0;i<arr.length;i++)
        {   
            for(int j=i;j<arr.length;j++)
            {   
               for(int k=i;k<=j;k++)
               {    
                   System.out.print( arr[k] + " ");
                   tot++;
               }
               System.out.println();
            }
            System.out.println();
            
        }
        System.out.println("total pairs are "+tot);
            
    }
    public static void main(String args[])
    {
        int arr[]={0, 1, -2, -3, -4} ;
        printsubarrays(arr);
        
        
    }
}
