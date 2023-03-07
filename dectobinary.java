class op
{
    static void binaryop(int n)
    {
        int bin=0;
        int myno=n;
        int power=0;
        int ld;
        while(n>0)
        {
            ld=n%2;
            bin=bin+ (ld* (int) Math.pow(10,power));
            power++;
            n=n/2;
            
        }
        System.out.println("binary  is"+ bin );
            
    }
}
public class dectobinary{
    public static void main(String args[])
    {
        op.binaryop(101);
    }
}
