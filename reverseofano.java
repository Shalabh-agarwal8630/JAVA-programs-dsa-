import java. util. *; 
public class reverseofano {
    public static  void main(String args[])
        {int n=382;
        while(n>0)
        {
            int lastdigit=n%10;
            System.out.print(lastdigit);
            n=n/10;
        }
    }
}