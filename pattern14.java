public class pattern14  {
    public static void main(String args[])
     {
        
        int x;

        for (int i = 1; i <= 5; i++) 
        {   x=5-i+1;
            for (int j = 1; j <= 5; j++) 
           {
                System.out.print(x + " ");
                x=x+5;
                
            }

            System.out.println();
        }

    }
} 
