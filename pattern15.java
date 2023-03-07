public class pattern15 {
    public static void main(String args[])
     {
        
        int x;

        for (int i = 1; i <= 5; i++) 
        {   x=i;
            for (int j = 1; j <= 5; j++) 
            {
                System.out.print(x + " ");
                x+=9;
                
            }

            System.out.println();
        }

    }
} 
