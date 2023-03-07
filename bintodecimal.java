class op
{
    static void binaryop(int n)
    {
        int dec=0;
        int myno=n;
        int power=0;
        int ld;
        while(n>0)
        {
            ld=n%10;
            dec=dec+(ld* (int)Math.pow(2,power));
            power++;
            n=n/10;
            
        }
        System.out.println("decimal is"+ dec );
            
    }
}
public class bintodecimal {
    public static void main(String args[])
    {
        op.binaryop(101);
    }
}
